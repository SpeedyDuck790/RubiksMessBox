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

        }
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}