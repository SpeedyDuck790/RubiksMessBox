package Display;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

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

    // game loop
    @Override
    public void run() {
        while (Gthread != null) {

            update();
            repaint();

        }
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    // update method
    public void update() {
        if (keyValue.UPressed == true) {
            System.out.println("UPressed");
        }
        if (keyValue.DPressed == true) {
            System.out.println("DPressed");
        }
        if (keyValue.LPressed == true) {
            System.out.println("LPressed");
        }
        if (keyValue.RPressed == true) {
            System.out.println("RPressed");
        }
        if (keyValue.FPressed == true) {
            System.out.println("FPressed");
        }
        if (keyValue.BPressed == true) {
            System.out.println("BPressed");
        }
        if (keyValue.xPressed == true) {
            System.out.println("xPressed");
        }
        if (keyValue.yPressed == true) {
            System.out.println("yPressed");
        }
        if (keyValue.zPressed == true) {
            System.out.println("zPressed");
        }
        if (keyValue.resetPressed == true) {
            System.out.println("resetPressed");
        }
        if (keyValue.newfacepressed == true) {
            System.out.println("newfacepressed");
        }

    }

    String[][][] cube = new String[6][3][3];
    int face = 0;

    public void setface() {
        face = face + 1;
    }

    public int getface() {
        return face;
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

        // draw cube
        if (face == 0) {
            tile1.setColor(Color.WHITE);
            tile1.fillRect(0, 0, cubeTile, cubeTile);

            tile2.setColor(Color.RED);
            tile2.fillRect(cubeTile, 0, cubeTile, cubeTile);

            tile3.setColor(Color.BLUE);
            tile3.fillRect(cubeTile * 2, 0, cubeTile, cubeTile);

            tile4.setColor(Color.GREEN);
            tile4.fillRect(0, cubeTile, cubeTile, cubeTile);

            tile5.setColor(Color.ORANGE);
            tile5.fillRect(cubeTile, cubeTile, cubeTile, cubeTile);

            tile6.setColor(Color.YELLOW);
            tile6.fillRect(cubeTile * 2, cubeTile, cubeTile, cubeTile);

            tile7.setColor(Color.BLUE);
            tile7.fillRect(0, cubeTile * 2, cubeTile, cubeTile);

            tile8.setColor(Color.RED);
            tile8.fillRect(cubeTile, cubeTile * 2, cubeTile, cubeTile);

            tile9.setColor(Color.GREEN);
            tile9.fillRect(cubeTile * 2, cubeTile * 2, cubeTile, cubeTile);
        }
        if (face == 1) {
            tile1.setColor(Color.RED);
            tile1.fillRect(0, 0, cubeTile, cubeTile);

            tile2.setColor(Color.RED);
            tile2.fillRect(cubeTile, 0, cubeTile, cubeTile);

            tile3.setColor(Color.RED);
            tile3.fillRect(cubeTile * 2, 0, cubeTile, cubeTile);

            tile4.setColor(Color.GREEN);
            tile4.fillRect(0, cubeTile, cubeTile, cubeTile);

            tile5.setColor(Color.ORANGE);
            tile5.fillRect(cubeTile, cubeTile, cubeTile, cubeTile);

            tile6.setColor(Color.RED);
            tile6.fillRect(cubeTile * 2, cubeTile, cubeTile, cubeTile);

            tile7.setColor(Color.RED);
            tile7.fillRect(0, cubeTile * 2, cubeTile, cubeTile);

            tile8.setColor(Color.RED);
            tile8.fillRect(cubeTile, cubeTile * 2, cubeTile, cubeTile);

            tile9.setColor(Color.GREEN);
            tile9.fillRect(cubeTile * 2, cubeTile * 2, cubeTile, cubeTile);
        }
    }

}