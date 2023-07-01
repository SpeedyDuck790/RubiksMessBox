package Display;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JOptionPane;
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

    // screen method
    public screen() {
        this.setPreferredSize(new Dimension(screenwidth, screenheight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
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
            System.out.println("running");

            // update();
            // repaint();

        }
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    // update method
    public void update() {

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

}