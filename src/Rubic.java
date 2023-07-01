import RubicCube.Cube;
import Actions.*;
import Display.screen;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

class Rubic {
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

        moves move = new moves();
        setting set = new setting();
        output out = new output();

        // System.out.println("----------------Cube--------------");

        // cube = set.CubesetDefault(cube);

        // out.ShowCube(cube);

        // System.out.println("----------------Cube R turned--------------");

        // move.R(cube, 0);

        // out.ShowCube(cube);
        // System.out.println("----------------Cube R turned--------------");

        // move.R(cube, 0);

        // out.ShowCube(cube);
        // System.out.println("----------------Cube R turned--------------");

        // move.R(cube, 0);

        // out.ShowCube(cube);
        // System.out.println("----------------back to normal--------------");

        // move.R(cube, 0);

        // out.ShowCube(cube);

        // System.out.println("----------------Cube L turned--------------");

        // move.L(cube, 0);
        // move.R(cube, 0);

        // out.ShowCube(cube);

    }
}