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
    final int screenwidth = cubeTile * 3;
    final int screenheight = cubeTile * 3;
    keyboard keyValue = new keyboard();

    // screen method
    public screen() {
        this.setPreferredSize(new Dimension(screenwidth, screenheight));
        this.setBackground(Color.BLACK);
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

        String colour1 = grabcubecolor(tile1, cube, face, 0, 0);
        String colour2 = grabcubecolor(tile2, cube, face, 0, 1);
        String color3 = grabcubecolor(tile3, cube, face, 0, 2);
        String color4 = grabcubecolor(tile4, cube, face, 1, 0);
        String color5 = grabcubecolor(tile5, cube, face, 1, 1);
        String color6 = grabcubecolor(tile6, cube, face, 1, 2);
        String color7 = grabcubecolor(tile7, cube, face, 2, 0);
        String color8 = grabcubecolor(tile8, cube, face, 2, 1);
        String color9 = grabcubecolor(tile9, cube, face, 2, 2);

        System.out.println(colour1 + colour2 + color3 + color4 + color5 + color6 + color7 + color8 + color9);

        colorchoice(colour1, tile1);
        tile1.fillRect(0, 0, cubeTile, cubeTile);
        colorchoice(colour2, tile2);
        tile2.fillRect(cubeTile, 0, cubeTile, cubeTile);
        colorchoice(color3, tile3);
        tile3.fillRect(cubeTile * 2, 0, cubeTile, cubeTile);
        colorchoice(color4, tile4);
        tile4.fillRect(0, cubeTile, cubeTile, cubeTile);
        colorchoice(color5, tile5);
        tile5.fillRect(cubeTile, cubeTile, cubeTile, cubeTile);
        colorchoice(color6, tile6);
        tile6.fillRect(cubeTile * 2, cubeTile, cubeTile, cubeTile);
        colorchoice(color7, tile7);
        tile7.fillRect(0, cubeTile * 2, cubeTile, cubeTile);
        colorchoice(color8, tile8);
        tile8.fillRect(cubeTile, cubeTile * 2, cubeTile, cubeTile);
        colorchoice(color9, tile9);
        tile9.fillRect(cubeTile * 2, cubeTile * 2, cubeTile, cubeTile);

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
        } else {
            tile.setColor(Color.PINK);
        }

    }
}