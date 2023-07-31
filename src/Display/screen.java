package Display;

import java.awt.*;
// import java.awt.event.*;
// import java.awt.image.BufferedImage;
// import java.awt.image.ImageObserver;

// import javax.imageio.ImageIO;
import javax.swing.*;
import Cube.*;
import Actions.moves;
import Actions.output;
import controls.keyboard;

// import java.io.*;
// import java.nio.Buffer;
// import java.util.*;

public class screen extends JPanel implements Runnable {
    // cube dimensions
    final int sizecubetile = 10;// 10x10
    final int scale = 7;

    // res scaling
    final int cubeTile = sizecubetile * scale;

    // Screen dimensions
    final int screenwidth = 830;
    final int screenheight = 1200;
    keyboard keyValue = new keyboard();

    // screen method
    public screen() {
        this.setPreferredSize(new Dimension(screenwidth, screenheight));
        this.setBackground(new Color(21, 21, 21));
        this.setDoubleBuffered(true);
        this.addKeyListener(keyValue);
        this.setFocusable(true);

    }

    // thread
    Thread Gthread;

    // start method
    public void startGthread() {
        Gthread = new Thread(this);
        Gthread.start();
    }

    int FPS = 5;

    // game loop
    @Override
    public void run() {
        double actionInterval = 1000000000.0 / FPS;
        double nextAction = System.nanoTime() + actionInterval;
        while (Gthread != null) {

            update();
            repaint();

            try {
                double wait = nextAction - System.nanoTime();
                wait = wait / 1000000;

                if (wait < 0) {
                    wait = 0;
                }
                Thread.sleep((long) wait);
                nextAction += actionInterval;

            } catch (Exception e) {
                System.out.println("Error in game loop");
            }

        }
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    String[][][] cube = new String[6][3][3];
    static int face = 0;
    String movestring = "?";
    String movedef = "F to Start";
    String cubeSkin = "Cube Type:null skin (numbers or F)";
    String Log = "Cube config:";

    public void MDR() {
        moves move = new moves();
        move.D(cube, face);
    }

    // update method
    public void update() {
        positionSetting position = new positionSetting();
        output output = new output();
        moves move = new moves();
        if (keyValue.UPressed == true && keyValue.Alt == false) {
            System.out.println("UPressed");
            move.U(cube, face);
            movestring = "Q";
            movedef = "Move:U";
            Log("U,");
        }
        if (keyValue.DPressed == true) {
            System.out.println("DPressed");
            move.D(cube, face);
            movestring = "W";
            movedef = "Move:D";
            Log("D,");
        }
        if (keyValue.LPressed == true) {
            System.out.println("LPressed");
            move.L(cube, face);
            movestring = "E";
            movedef = "Move:L";
            Log("L,");
        }
        if (keyValue.RPressed == true) {
            System.out.println("RPressed");
            move.R(cube, face);
            movestring = "R";
            movedef = "Move:R";
            Log("R,");
        }
        if (keyValue.FPressed == true) {
            System.out.println("FPressed");
            movestring = "S";
            movedef = "Move:F";
            move.F(cube, face);
            Log("F,");
        }
        if (keyValue.BPressed == true) {
            System.out.println("BPressed");
            move.B(cube, face);
            movestring = "D";
            movedef = "Move:B";
            Log("B,");
        }
        if (keyValue.xPressed == true) {
            System.out.println("xPressed");
            move.M(cube, face);
            movestring = "T";
            movedef = "Move:M";
            Log("M,");
        }
        if (keyValue.yPressed == true) {
            System.out.println("yPressed");
            move.E(cube, face);
            movestring = "G";
            movedef = "Move:E";
            Log("E,");
        }
        if (keyValue.zPressed == true) {
            System.out.println("zPressed");
            move.S(cube, face);
            movestring = "B";
            movedef = "Move:S";
            Log("S,");
        }
        if (keyValue.resetPressed == true) {
            System.out.println("resetPressed");
            cube = position.Default();
            movestring = "F";
            movedef = "-READY-";
            ClearLog();
            cubeSkin = "Default";
        }
        if (keyValue.newfacepressed == true) {
            System.out.println("newfacepressed");
            // setface();
            output.ShowSide(face);
            movestring = "A";
            movedef = "Rotated";
        }
        if (keyValue.switched == true) {
            System.out.println("switched");
            cube = position.switched();
            movestring = "1";
            movedef = "CP: Switched";
            ClearLog();
            cubeSkin = "Switched";
        }
        if (keyValue.testingRotation == true) {
            System.out.println("TestSkinPressed");
            cube = position.testingRotation();
            movestring = "2";
            movedef = "CS: Test Rota";
            ClearLog();
            cubeSkin = "Test Rotation";
        }

        if (keyValue.testingFanB == true) {
            System.out.println("TestSkinPressed");
            cube = position.testingFanB();
            movestring = "3";
            movedef = "CS: Test F,B";
            ClearLog();
            cubeSkin = "Test F an B";
        }
        if (keyValue.Alt == true) {
            System.out.println("Shift");
        }
        if (keyValue.UPressed2 == true) {
            System.out.println("U'Pressed");
        }
        // _______________________________________________________________________________________________________
        if (keyValue.UPressed2 == true) {
            System.out.println("UPressed");
            move.Ur(cube, face);
            movestring = "shift+Q";
            movedef = "Move:U'";
            Log("U',");
        }
        if (keyValue.DPressed2 == true) {
            System.out.println("DPressed");
            move.Dr(cube, face);
            movestring = "shift+W";
            movedef = "Move:D'";
            Log("D',");
        }
        if (keyValue.LPressed2 == true) {
            System.out.println("LPressed");
            move.Lr(cube, face);
            movestring = "shift+E";
            movedef = "Move:L'";
            Log("L',");
        }
        if (keyValue.RPressed2 == true) {
            System.out.println("RPressed");
            move.Rr(cube, face);
            movestring = "shift+R";
            movedef = "Move:R'";
            Log("R',");
        }
        if (keyValue.FPressed2 == true) {
            System.out.println("FPressed");
            movestring = "shift+S";
            movedef = "Move:F'";
            move.Fr(cube, face);
            Log("F',");
        }
        if (keyValue.BPressed2 == true) {
            System.out.println("BPressed");
            move.Br(cube, face);
            movestring = "shift+D";
            movedef = "Move:B'";
            Log("B',");
        }
        if (keyValue.xPressed2 == true) {
            System.out.println("xPressed");
            move.Mr(cube, face);
            movestring = "shift+T";
            movedef = "Move:M'";
            Log("M',");
        }
        if (keyValue.yPressed2 == true) {
            System.out.println("yPressed");
            move.Er(cube, face);
            movestring = "shift+G";
            movedef = "Move:E'";
            Log("E',");
        }
        if (keyValue.zPressed2 == true) {
            System.out.println("zPressed");
            move.Sr(cube, face);
            movestring = "shift+B";
            movedef = "Move:S'";
            Log("S',");
        }
    }

    String secondline = "";

    public void Log(String Logable) {
        System.out.println("log:" + Logable);
        Log = Log + Logable;
        if (Log.length() > 73) {

            secondline = Log.substring(74, Log.length());
        }

    }

    public void ClearLog() {
        Log = "Cube config:";
        secondline = "";

    }

    public void setface() {
        if (face == 5) {
            face = 0;
        } else {
            face = face + 1;
        }
    }

    public static int getface() {
        return face;
    }

    public void setcubedata(String[][][] newcube) {
        System.out.println("cube changed");
        cube = newcube;
    }

    public String[][][] getcubedata() {
        return cube;

    }

    int Fpscurrent = 0;

    public void frames() {
        if (Fpscurrent == 60) {
            Fpscurrent = 0;
        }
        Fpscurrent = Fpscurrent + 1;

    }

    // update method
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D tile1 = (Graphics2D) g;
        Graphics2D tile2 = (Graphics2D) g;
        Graphics2D tile3 = (Graphics2D) g;
        Graphics2D tile4 = (Graphics2D) g;
        Graphics2D tile5 = (Graphics2D) g;
        Graphics2D tile6 = (Graphics2D) g;
        Graphics2D tile7 = (Graphics2D) g;
        Graphics2D tile8 = (Graphics2D) g;
        Graphics2D tile9 = (Graphics2D) g;
        Graphics2D space = (Graphics2D) g;
        Graphics2D title = (Graphics2D) g;
        Graphics2D button = (Graphics2D) g;
        Graphics2D bpanel = (Graphics2D) g;
        // Graphics2D logo = (Graphics2D) g;

        String colour1 = grabcubecolor(tile1, cube, face, 0, 0);
        String colour2 = grabcubecolor(tile2, cube, face, 0, 1);
        String color3 = grabcubecolor(tile3, cube, face, 0, 2);
        String color4 = grabcubecolor(tile4, cube, face, 1, 0);
        String color5 = grabcubecolor(tile5, cube, face, 1, 1);
        String color6 = grabcubecolor(tile6, cube, face, 1, 2);
        String color7 = grabcubecolor(tile7, cube, face, 2, 0);
        String color8 = grabcubecolor(tile8, cube, face, 2, 1);
        String color9 = grabcubecolor(tile9, cube, face, 2, 2);

        String colorR1 = grabcubecolor(tile1, cube, 3, 0, 0);
        String colorR2 = grabcubecolor(tile2, cube, 3, 0, 1);
        String colorR3 = grabcubecolor(tile3, cube, 3, 0, 2);
        String colorR4 = grabcubecolor(tile4, cube, 3, 1, 0);
        String colorR5 = grabcubecolor(tile5, cube, 3, 1, 1);
        String colorR6 = grabcubecolor(tile6, cube, 3, 1, 2);
        String colorR7 = grabcubecolor(tile7, cube, 3, 2, 0);
        String colorR8 = grabcubecolor(tile8, cube, 3, 2, 1);
        String colorR9 = grabcubecolor(tile9, cube, 3, 2, 2);

        String colorL1 = grabcubecolor(tile1, cube, 2, 0, 0);
        String colorL2 = grabcubecolor(tile2, cube, 2, 0, 1);
        String colorL3 = grabcubecolor(tile3, cube, 2, 0, 2);
        String colorL4 = grabcubecolor(tile4, cube, 2, 1, 0);
        String colorL5 = grabcubecolor(tile5, cube, 2, 1, 1);
        String colorL6 = grabcubecolor(tile6, cube, 2, 1, 2);
        String colorL7 = grabcubecolor(tile7, cube, 2, 2, 0);
        String colorL8 = grabcubecolor(tile8, cube, 2, 2, 1);
        String colorL9 = grabcubecolor(tile9, cube, 2, 2, 2);

        String colorT1 = grabcubecolor(tile1, cube, 4, 0, 0);
        String colorT2 = grabcubecolor(tile2, cube, 4, 0, 1);
        String colorT3 = grabcubecolor(tile3, cube, 4, 0, 2);
        String colorT4 = grabcubecolor(tile4, cube, 4, 1, 0);
        String colorT5 = grabcubecolor(tile5, cube, 4, 1, 1);
        String colorT6 = grabcubecolor(tile6, cube, 4, 1, 2);
        String colorT7 = grabcubecolor(tile7, cube, 4, 2, 0);
        String colorT8 = grabcubecolor(tile8, cube, 4, 2, 1);
        String colorT9 = grabcubecolor(tile9, cube, 4, 2, 2);

        String colorU1 = grabcubecolor(tile1, cube, 5, 0, 0);
        String colorU2 = grabcubecolor(tile2, cube, 5, 0, 1);
        String colorU3 = grabcubecolor(tile3, cube, 5, 0, 2);
        String colorU4 = grabcubecolor(tile4, cube, 5, 1, 0);
        String colorU5 = grabcubecolor(tile5, cube, 5, 1, 1);
        String colorU6 = grabcubecolor(tile6, cube, 5, 1, 2);
        String colorU7 = grabcubecolor(tile7, cube, 5, 2, 0);
        String colorU8 = grabcubecolor(tile8, cube, 5, 2, 1);
        String colorU9 = grabcubecolor(tile9, cube, 5, 2, 2);

        String colorB1 = grabcubecolor(tile1, cube, 1, 0, 0);
        String colorB2 = grabcubecolor(tile2, cube, 1, 0, 1);
        String colorB3 = grabcubecolor(tile3, cube, 1, 0, 2);
        String colorB4 = grabcubecolor(tile4, cube, 1, 1, 0);
        String colorB5 = grabcubecolor(tile5, cube, 1, 1, 1);
        String colorB6 = grabcubecolor(tile6, cube, 1, 1, 2);
        String colorB7 = grabcubecolor(tile7, cube, 1, 2, 0);
        String colorB8 = grabcubecolor(tile8, cube, 1, 2, 1);
        String colorB9 = grabcubecolor(tile9, cube, 1, 2, 2);

        frames();

        System.out.println("Frame processed " + Fpscurrent);

        System.out.println("CF:contents check processed:S" + face);
        System.out.println("++++++++++++++++++++++++++++++\n()" + colour1 + colour2 + color3 + "()\n()" + color4
                + color5 + color6
                + "()\n()" + color7 + color8 + color9 + "()\n++++++++++++++++++++++++++++++");

        int rubbreak = 5;
        int spacing = cubeTile / 7;
        int rubikTile = 30 * scale + (spacing * 2);
        int rubikview = 240 + (spacing * 4) + 2 * rubbreak;
        int textalign = 140 + spacing * 2;
        int topspace = 40;
        int margin = 270 + topspace;
        // -----------------------------------------------------------------------------------------LEFT
        colorchoice("X", space);
        space.fillRect(rubbreak, margin, rubikTile + spacing * 2, spacing);
        colorchoice("X", space);
        space.fillRect(rubbreak, 3 * cubeTile + 3 * spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, 2 * cubeTile + 2 * spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, cubeTile + spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, spacing + margin, spacing, rubikTile);
        colorchoice(colorL1, tile1);
        tile1.fillRect(rubbreak + spacing, spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + spacing + cubeTile, spacing + margin, spacing, rubikTile);
        colorchoice(colorL2, tile2);
        tile2.fillRect(rubbreak + cubeTile + spacing * 2, margin + spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + 2 * spacing + (2 * cubeTile), margin + spacing, spacing, rubikTile);
        colorchoice(colorL3, tile3);
        tile3.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), margin + spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + 3 * spacing + cubeTile * 3, margin + spacing, spacing, rubikTile);

        colorchoice(colorL4, tile4);
        tile4.fillRect(rubbreak + spacing, margin + cubeTile + 2 * spacing, cubeTile, cubeTile);
        colorchoice(colorL5, space);
        tile5.fillRect(rubbreak + cubeTile + spacing * 2, margin + cubeTile + 2 * spacing, cubeTile, cubeTile);
        colorchoice(colorL6, space);
        tile6.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), margin + cubeTile + 2 * spacing, cubeTile, cubeTile);

        colorchoice(colorL7, tile7);
        tile4.fillRect(rubbreak + spacing, 2 * cubeTile + 3 * spacing + margin, cubeTile, cubeTile);
        colorchoice(colorL8, tile8);
        tile5.fillRect(rubbreak + cubeTile + spacing * 2, 2 * cubeTile + 3 * spacing + margin, cubeTile, cubeTile);
        colorchoice(colorL9, tile9);
        tile6.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), 2 * cubeTile + 3 * spacing + margin, cubeTile,
                cubeTile);
        // ---------------------------------------------------------------------------------------------------------------------------TOP
        colorchoice("X", space);
        space.fillRect(rubikview, topspace, rubikTile + spacing * 2, spacing);
        colorchoice("X", space);
        space.fillRect(rubikview, 3 * cubeTile + 3 * spacing + topspace, rubikTile + spacing *
                2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, 2 * cubeTile + 2 * spacing + topspace, rubikTile + spacing *
                2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, cubeTile + spacing + topspace, rubikTile + spacing * 2,
                spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, spacing + topspace, spacing, rubikTile);
        colorchoice(colorT1, tile1);
        tile1.fillRect(rubikview + spacing, spacing + topspace, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + spacing + cubeTile, spacing + topspace, spacing, rubikTile);
        colorchoice(colorT2, tile2);
        tile2.fillRect(rubikview + cubeTile + spacing * 2, spacing + topspace, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + 2 * spacing + (2 * cubeTile), spacing + topspace, spacing, rubikTile);
        colorchoice(colorT3, tile3);
        tile3.fillRect(rubikview + 3 * spacing + (cubeTile * 2), spacing + topspace, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + 3 * spacing + cubeTile * 3, spacing + topspace, spacing, rubikTile);

        colorchoice(colorT4, tile4);
        tile4.fillRect(rubikview + spacing, cubeTile + 2 * spacing + topspace, cubeTile, cubeTile);
        colorchoice(colorT5, space);
        tile5.fillRect(rubikview + cubeTile + spacing * 2, cubeTile + 2 * spacing + topspace, cubeTile, cubeTile);
        colorchoice(colorT6, space);
        tile6.fillRect(rubikview + 3 * spacing + (cubeTile * 2), cubeTile + 2 * spacing + topspace, cubeTile, cubeTile);

        colorchoice(colorT7, tile7);
        tile4.fillRect(rubikview + spacing, 2 * cubeTile + 3 * spacing + topspace, cubeTile, cubeTile);
        colorchoice(colorT8, tile8);
        tile5.fillRect(rubikview + cubeTile + spacing * 2, 2 * cubeTile + 3 *
                spacing + topspace, cubeTile, cubeTile);
        colorchoice(colorT9, tile9);
        tile9.fillRect(rubikview + 3 * spacing + (cubeTile * 2), 2 * cubeTile + 3 * spacing + topspace,
                cubeTile, cubeTile);
        // -------------------------------------------------------------------------------------------------------RIGHT
        colorchoice("X", space);
        space.fillRect(2 * rubikview - rubbreak, margin, rubikTile + spacing * 2, spacing);
        colorchoice("X", space);
        space.fillRect(2 * rubikview - rubbreak, 3 * cubeTile + 3 * spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(2 * rubikview - rubbreak, 2 * cubeTile + 2 * spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(2 * rubikview - rubbreak, cubeTile + spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(2 * rubikview - rubbreak, spacing + margin, spacing, rubikTile);
        colorchoice(colorR1, tile1);
        tile1.fillRect(2 * rubikview + spacing - rubbreak, spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(2 * rubikview + spacing + cubeTile - rubbreak, spacing + margin, spacing,
                rubikTile);
        colorchoice(colorR2, tile2);
        tile2.fillRect(2 * rubikview + cubeTile + spacing * 2 - rubbreak, spacing + margin, cubeTile,
                cubeTile);
        colorchoice("X", space);
        space.fillRect(2 * rubikview + 2 * spacing + (2 * cubeTile) - rubbreak, spacing + margin,
                spacing, rubikTile);
        colorchoice(colorR3, tile3);
        tile3.fillRect(2 * rubikview + 3 * spacing + (cubeTile * 2) - rubbreak, spacing + margin,
                cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(2 * rubikview + 3 * spacing + cubeTile * 3 - rubbreak, spacing + margin, spacing,
                rubikTile);

        colorchoice(colorR4, tile4);
        tile4.fillRect(2 * rubikview + spacing - rubbreak, cubeTile + 2 * spacing + margin, cubeTile,
                cubeTile);
        colorchoice(colorR5, space);
        tile5.fillRect(2 * rubikview + cubeTile + spacing * 2 - rubbreak, cubeTile + 2 *
                spacing + margin, cubeTile, cubeTile);
        colorchoice(colorR6, space);
        tile6.fillRect(2 * rubikview + 3 * spacing + (cubeTile * 2) - rubbreak, cubeTile + 2 *
                spacing + margin, cubeTile, cubeTile);

        colorchoice(colorR7, tile7);
        tile7.fillRect(2 * rubikview + spacing - rubbreak, 2 * cubeTile + 3 * spacing + margin, cubeTile,
                cubeTile);
        colorchoice(colorR8, tile8);
        tile8.fillRect(2 * rubikview + cubeTile + spacing * 2 - rubbreak, 2 * cubeTile + 3 *
                spacing + margin, cubeTile, cubeTile);
        colorchoice(colorR9, tile9);
        tile9.fillRect(2 * rubikview + 3 * spacing + (cubeTile * 2) - rubbreak, 2 * cubeTile + 3
                * spacing + margin,
                cubeTile, cubeTile);

        // ---------------------------------------------------------------------------------------------------------------------------------------FRONT
        colorchoice("X", space);
        space.fillRect(rubikview, margin, rubikTile + spacing * 2, spacing);
        colorchoice("X", space);
        space.fillRect(rubikview, 3 * cubeTile + 3 * spacing + margin, rubikTile + spacing *
                2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, 2 * cubeTile + 2 * spacing + margin, rubikTile + spacing *
                2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, cubeTile + spacing + margin, rubikTile + spacing * 2,
                spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, spacing + margin, spacing, rubikTile);
        colorchoice(colour1, tile1);
        tile1.fillRect(rubikview + spacing, spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + spacing + cubeTile, spacing + margin, spacing, rubikTile);
        colorchoice(colour2, tile2);
        tile2.fillRect(rubikview + cubeTile + spacing * 2, spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + 2 * spacing + (2 * cubeTile), spacing + margin, spacing, rubikTile);
        colorchoice(color3, tile3);
        tile3.fillRect(rubikview + 3 * spacing + (cubeTile * 2), spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + 3 * spacing + cubeTile * 3, spacing + margin, spacing, rubikTile);

        colorchoice(color4, tile4);
        tile4.fillRect(rubikview + spacing, cubeTile + 2 * spacing + margin, cubeTile, cubeTile);
        colorchoice(color5, tile5);
        tile5.fillRect(rubikview + cubeTile + spacing * 2, cubeTile + 2 * spacing + margin, cubeTile, cubeTile);
        colorchoice(color6, tile6);
        tile6.fillRect(rubikview + 3 * spacing + (cubeTile * 2), cubeTile + 2 * spacing + margin, cubeTile, cubeTile);

        colorchoice(color7, tile7);
        tile7.fillRect(rubikview + spacing, 2 * cubeTile + 3 * spacing + margin, cubeTile, cubeTile);
        colorchoice(color8, tile8);
        tile8.fillRect(rubikview + cubeTile + spacing * 2, 2 * cubeTile + 3 *
                spacing + margin, cubeTile, cubeTile);
        colorchoice(color9, tile9);
        tile9.fillRect(rubikview + 3 * spacing + (cubeTile * 2), 2 * cubeTile + 3 * spacing + margin,
                cubeTile, cubeTile);
        // -------------------------------------------------------------------------------------------------------BACK
        margin = (margin * 2) - topspace;
        colorchoice("X", space);
        space.fillRect(rubbreak, margin, rubikTile + spacing * 2, spacing);
        colorchoice("X", space);
        space.fillRect(rubbreak, 3 * cubeTile + 3 * spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, 2 * cubeTile + 2 * spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, cubeTile + spacing + margin, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, spacing + margin, spacing, rubikTile);
        colorchoice(colorB1, tile1);
        tile1.fillRect(rubbreak + spacing, spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + spacing + cubeTile, spacing + margin, spacing, rubikTile);
        colorchoice(colorB2, tile2);
        tile2.fillRect(rubbreak + cubeTile + spacing * 2, margin + spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + 2 * spacing + (2 * cubeTile), margin + spacing, spacing, rubikTile);
        colorchoice(colorB3, tile3);
        tile3.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), margin + spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + 3 * spacing + cubeTile * 3, margin + spacing, spacing, rubikTile);

        colorchoice(colorB4, tile4);
        tile4.fillRect(rubbreak + spacing, margin + cubeTile + 2 * spacing, cubeTile, cubeTile);
        colorchoice(colorB5, space);
        tile5.fillRect(rubbreak + cubeTile + spacing * 2, margin + cubeTile + 2 * spacing, cubeTile, cubeTile);
        colorchoice(colorB6, space);
        tile6.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), margin + cubeTile + 2 * spacing, cubeTile, cubeTile);

        colorchoice(colorB7, tile7);
        tile4.fillRect(rubbreak + spacing, 2 * cubeTile + 3 * spacing + margin, cubeTile, cubeTile);
        colorchoice(colorB8, tile8);
        tile5.fillRect(rubbreak + cubeTile + spacing * 2, 2 * cubeTile + 3 * spacing + margin, cubeTile, cubeTile);
        colorchoice(colorB9, tile9);
        tile6.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), 2 * cubeTile + 3 * spacing + margin, cubeTile,
                cubeTile);
        // -----------------------------------------------------------------------------------------------------------UNDER
        colorchoice("X", space);
        space.fillRect(rubikview, margin, rubikTile + spacing * 2, spacing);
        colorchoice("X", space);
        space.fillRect(rubikview, 3 * cubeTile + 3 * spacing + margin, rubikTile + spacing *
                2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, 2 * cubeTile + 2 * spacing + margin, rubikTile + spacing *
                2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, cubeTile + spacing + margin, rubikTile + spacing * 2,
                spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, spacing + margin, spacing, rubikTile);
        colorchoice(colorU1, tile1);
        tile1.fillRect(rubikview + spacing, spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + spacing + cubeTile, spacing + margin, spacing, rubikTile);
        colorchoice(colorU2, tile2);
        tile2.fillRect(rubikview + cubeTile + spacing * 2, spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + 2 * spacing + (2 * cubeTile), spacing + margin, spacing, rubikTile);
        colorchoice(colorU3, tile3);
        tile3.fillRect(rubikview + 3 * spacing + (cubeTile * 2), spacing + margin, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + 3 * spacing + cubeTile * 3, spacing + margin, spacing, rubikTile);

        colorchoice(colorU4, tile4);
        tile4.fillRect(rubikview + spacing, cubeTile + 2 * spacing + margin, cubeTile, cubeTile);
        colorchoice(colorU5, tile5);
        tile5.fillRect(rubikview + cubeTile + spacing * 2, cubeTile + 2 * spacing + margin, cubeTile, cubeTile);
        colorchoice(colorU6, tile6);
        tile6.fillRect(rubikview + 3 * spacing + (cubeTile * 2), cubeTile + 2 * spacing + margin, cubeTile, cubeTile);

        colorchoice(colorU7, tile7);
        tile7.fillRect(rubikview + spacing, 2 * cubeTile + 3 * spacing + margin, cubeTile, cubeTile);
        colorchoice(colorU8, tile8);
        tile8.fillRect(rubikview + cubeTile + spacing * 2, 2 * cubeTile + 3 *
                spacing + margin, cubeTile, cubeTile);
        colorchoice(colorU9, tile9);
        tile9.fillRect(rubikview + 3 * spacing + (cubeTile * 2), 2 * cubeTile + 3 * spacing + margin,
                cubeTile, cubeTile);
        // -----------------------------------------------------------------------------------------------------------
        title.setColor(new Color(145, 49, 117));
        title.setFont(new Font("TimesRoman", Font.BOLD, 20));
        title.drawString("Left", textalign - 50, 250 + topspace + 18);
        title.drawString("Front", 3 * textalign - 90, 250 + topspace + 18);
        title.drawString("Right", 5 * textalign - 125, 250 + topspace + 16);
        title.drawString("Back", textalign - 55, 520 + topspace + 18);
        title.drawString("Top", 3 * textalign - 80, topspace / 2 + 15);
        title.drawString("Bottom", 3 * textalign - 100, 520 + topspace + 18);
        // -------------------------------------------------------------------------------------------------------
        bpanel.setColor(new Color(60, 65, 92));
        bpanel.fillRect(600, 700, 200, 100);
        button.setColor(new Color(180, 165, 165));
        button.fill3DRect(665, 715, cubeTile, cubeTile, getFocusTraversalKeysEnabled());
        title.setColor(new Color(145, 49, 117));
        title.setFont(new Font("TimesRoman", Font.BOLD, 20));
        title.drawString(movedef, 660, 680);
        title.setColor(getBackground());
        title.drawString(movestring, 695, 757);
        title.setColor(Color.WHITE);
        title.setFont(new Font("TimesRoman", Font.BOLD, 20));
        title.drawString(Log, 70, 900);
        title.setColor(Color.WHITE);
        title.setFont(new Font("TimesRoman", Font.BOLD, 20));
        title.drawString(secondline, 70, 930);

        title.setColor(Color.WHITE);
        title.setFont(new Font("TimesRoman", Font.BOLD, 20));
        title.drawString(cubeSkin, 50, 870);

        // -------------------------------------------------------------------------------------------------------
    }

    public String grabcubecolor(Graphics2D tile, String[][][] cube, int face, int rows, int cols) {
        String[][][] cubeConfig = cube;
        String color = cubeConfig[face][rows][cols];
        return color;
    }

    int i;

    public void colorchoice(String color, Graphics2D tile) {
        if (color == "W") {
            tile.setColor(Color.WHITE);
        } else if (color == "Y") {
            tile.setColor(Color.YELLOW);
        } else if (color == "R") {
            tile.setColor(Color.RED);
        } else if (color == "O") {
            tile.setColor(Color.ORANGE);
        } else if (color == "B") {
            tile.setColor(Color.BLUE);
        } else if (color == "G") {
            tile.setColor(Color.GREEN);
        } else if (color == "X") {
            tile.setColor(new Color(69, 69, 69));
        } else if (color == "BB") {
            tile.setColor(Color.BLACK);
        } else {

            ++i;
            if (i == 0) {
                tile.setColor(new Color(0, 0, 255));
            }
            if (i == 1) {
                tile.setColor(new Color(115, 147, 179));
            }
            if (i == 2) {
                tile.setColor(new Color(8, 143, 143));
            }
            if (i == 3) {
                tile.setColor(new Color(0, 150, 255));
            }
            if (i == 4) {
                tile.setColor(new Color(50, 255, 255));
                i = 0;
            }

        }

    }
}