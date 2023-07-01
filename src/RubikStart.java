
import Actions.*;
import Display.screen;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

class RubikStart {
    public static void main(String[] args) {

        // JFrame

        JFrame windowFrame = new JFrame();
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setResizable(false);
        windowFrame.setTitle("RubicMessBox");
        screen game = new screen();
        windowFrame.add(game);

        windowFrame.pack();

        windowFrame.setLocationRelativeTo(null);
        windowFrame.setVisible(true);

        game.startGthread();

        // ===========================================================================

        System.out.println("Hello im RubicMessBox!");
        System.out.println("I am a Rubik's Cube simulator!");
    }
}