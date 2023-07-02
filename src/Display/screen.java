package Display;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import Cube.*;
import Actions.moves;
import Actions.output;
import controls.keyboard;

import java.io.*;
import java.util.*;

public class screen extends JPanel implements Runnable {
    // cube dimensions
    final int sizecubetile = 10;// 10x10
    final int scale = 10;

    // res scaling
    final int cubeTile = sizecubetile * scale;

    // Screen dimensions
    final int screenwidth = cubeTile * 11;
    final int screenheight = cubeTile * 11;
    keyboard keyValue = new keyboard();

    // screen method
    public screen() {
        this.setPreferredSize(new Dimension(screenwidth, screenheight));
        this.setBackground(Color.LIGHT_GRAY);
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
    int face = 0;

    // update method
    public void update() {
        positionSetting position = new positionSetting();
        output output = new output();
        moves move = new moves();
        if (keyValue.UPressed == true) {
            System.out.println("UPressed");
        }
        move.U(cube, face);
        if (keyValue.DPressed == true) {
            System.out.println("DPressed");
            move.D(cube, face);
        }
        if (keyValue.LPressed == true) {
            System.out.println("LPressed");
            move.L(cube, face);
        }
        if (keyValue.RPressed == true) {
            System.out.println("RPressed");
            move.R(cube, face);
        }
        if (keyValue.FPressed == true) {
            System.out.println("FPressed");
            // move.F(cube, face);
        }
        if (keyValue.BPressed == true) {
            System.out.println("BPressed");
            // move.B(cube, face);
        }
        if (keyValue.xPressed == true) {
            System.out.println("xPressed");
            // move.x(cube, face);
        }
        if (keyValue.yPressed == true) {
            System.out.println("yPressed");
            // move.y(cube, face);
        }
        if (keyValue.zPressed == true) {
            System.out.println("zPressed");
            // move.z(cube, face);
        }
        if (keyValue.resetPressed == true) {
            System.out.println("resetPressed");
            cube = position.Default();
        }
        if (keyValue.newfacepressed == true) {
            System.out.println("newfacepressed");
            setface();
            output.ShowSide(face);
        }
        if (keyValue.switched == true) {
            System.out.println("switched");
            cube = position.switched();
        }
        if (keyValue.testingRotation == true) {
            System.out.println("TestSkinPressed");
            cube = position.testingRotation();
        }

    }

    public void setface() {
        if (face == 5) {
            face = 0;
        } else {
            face = face + 1;
        }
    }

    public int getface() {
        return face;
    }

    public void setcubedata(String[][][] newcube) {
        System.out.println("cube changed");
        cube = newcube;
    }

    public String[][][] getcubedata() {
        return cube;

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

        System.out.println(colour1 + colour2 + color3 + color4 + color5 + color6 + color7 + color8 + color9);

        int rubbreak = 50;
        int spacing = cubeTile / 5;
        int rubikTile = 100 * 3 + (spacing * 2);
        int rubikview = 300 + (spacing * 4) + 2 * rubbreak;
        int textalign = 140 + spacing * 2;
        colorchoice("X", space);
        space.fillRect(rubbreak, 0, rubikTile + spacing * 2, spacing);
        colorchoice("X", space);
        space.fillRect(rubbreak, 3 * cubeTile + 3 * spacing, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, 2 * cubeTile + 2 * spacing, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, cubeTile + spacing, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubbreak, spacing, spacing, rubikTile);
        colorchoice(colour1, tile1);
        tile1.fillRect(rubbreak + spacing, spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + spacing + cubeTile, spacing, spacing, rubikTile);
        colorchoice(colour2, tile2);
        tile2.fillRect(rubbreak + cubeTile + spacing * 2, spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + 2 * spacing + (2 * cubeTile), spacing, spacing, rubikTile);
        colorchoice(color3, tile3);
        tile3.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubbreak + 3 * spacing + cubeTile * 3, spacing, spacing, rubikTile);

        colorchoice(color4, tile4);
        tile4.fillRect(rubbreak + spacing, cubeTile + 2 * spacing, cubeTile, cubeTile);
        colorchoice(color5, space);
        tile5.fillRect(rubbreak + cubeTile + spacing * 2, cubeTile + 2 * spacing, cubeTile, cubeTile);
        colorchoice(color6, space);
        tile6.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), cubeTile + 2 * spacing, cubeTile, cubeTile);

        colorchoice(color7, tile7);
        tile4.fillRect(rubbreak + spacing, 2 * cubeTile + 3 * spacing, cubeTile, cubeTile);
        colorchoice(color8, tile8);
        tile5.fillRect(rubbreak + cubeTile + spacing * 2, 2 * cubeTile + 3 * spacing, cubeTile, cubeTile);
        colorchoice(color9, tile9);
        tile6.fillRect(rubbreak + 3 * spacing + (cubeTile * 2), 2 * cubeTile + 3 * spacing, cubeTile, cubeTile);

        colorchoice("X", space);
        space.fillRect(rubikview, 0, rubikTile + spacing * 2, spacing);
        colorchoice("X", space);
        space.fillRect(rubikview, 3 * cubeTile + 3 * spacing, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, 2 * cubeTile + 2 * spacing, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, cubeTile + spacing, rubikTile + spacing * 2, spacing);

        colorchoice("X", space);
        space.fillRect(rubikview, spacing, spacing, rubikTile);
        colorchoice(colorR1, tile1);
        tile1.fillRect(rubikview + spacing, spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + spacing + cubeTile, spacing, spacing, rubikTile);
        colorchoice(colorR2, tile2);
        tile2.fillRect(rubikview + cubeTile + spacing * 2, spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + 2 * spacing + (2 * cubeTile), spacing, spacing, rubikTile);
        colorchoice(colorR3, tile3);
        tile3.fillRect(rubikview + 3 * spacing + (cubeTile * 2), spacing, cubeTile, cubeTile);
        colorchoice("X", space);
        space.fillRect(rubikview + 3 * spacing + cubeTile * 3, spacing, spacing, rubikTile);

        colorchoice(colorR4, tile4);
        tile4.fillRect(rubikview + spacing, cubeTile + 2 * spacing, cubeTile, cubeTile);
        colorchoice(colorR5, space);
        tile5.fillRect(rubikview + cubeTile + spacing * 2, cubeTile + 2 * spacing, cubeTile, cubeTile);
        colorchoice(colorR6, space);
        tile6.fillRect(rubikview + 3 * spacing + (cubeTile * 2), cubeTile + 2 * spacing, cubeTile, cubeTile);

        colorchoice(colorR7, tile7);
        tile4.fillRect(rubikview + spacing, 2 * cubeTile + 3 * spacing, cubeTile, cubeTile);
        colorchoice(colorR8, tile8);
        tile5.fillRect(rubikview + cubeTile + spacing * 2, 2 * cubeTile + 3 *
                spacing, cubeTile, cubeTile);
        colorchoice(colorR9, tile9);
        tile6.fillRect(rubikview + 3 * spacing + (cubeTile * 2), 2 * cubeTile + 3 * spacing,
                cubeTile, cubeTile);
        title.setColor(Color.WHITE);
        title.drawString("Front", rubbreak + textalign - 3, 15);
        title.drawString("Right", 15 + 2 * rubbreak + textalign * 3, 15);
    }

    public String grabcubecolor(Graphics2D tile, String[][][] cube, int face, int rows, int cols) {
        String[][][] cubeConfig = cube;
        String color = cubeConfig[face][rows][cols];
        return color;
    }

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
            tile.setColor(Color.BLACK);
        } else {
            tile.setColor(Color.PINK);
        }

    }
}