package controls;

import Actions.*;
import Cube.positionSetting;
import Display.screen;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class rotationStation {

    public void createStation() {

        setLayout(new FlowLayout());

        JFrame Gamepad = new JFrame("Controller Rubiks Cube");
        Gamepad.setSize(250, 200);
        Gamepad.setVisible(true);
        Gamepad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Gamepad.setResizable(false);
        Gamepad.setLayout(new FlowLayout());

        int buttonSize = 50;

        JButton U;
        U = new JButton("U");
        Gamepad.getContentPane().add(U);
        U.setBounds(0, 0, buttonSize, buttonSize);
        U.addActionListener(new MyActionListener());

        JButton D = new JButton("D");
        Gamepad.getContentPane().add(D);
        D.setBounds(buttonSize, 0, buttonSize, buttonSize);
        D.addActionListener(new MyActionListener());

        JButton L = new JButton("L");
        Gamepad.getContentPane().add(L);
        L.setBounds(buttonSize * 2, 0, buttonSize, buttonSize);
        L.addActionListener(new MyActionListener());

        JButton R = new JButton("R");
        Gamepad.getContentPane().add(R);
        R.setBounds(buttonSize * 3, 0, buttonSize, buttonSize);
        R.addActionListener(new MyActionListener());

        JButton F = new JButton("F");
        Gamepad.getContentPane().add(F);
        F.setBounds(0, buttonSize, buttonSize, buttonSize);
        F.addActionListener(new MyActionListener());

        JButton B = new JButton("B");
        Gamepad.getContentPane().add(B);
        B.setBounds(buttonSize, buttonSize, buttonSize, buttonSize);
        B.addActionListener(new MyActionListener());

        JButton x = new JButton("x");
        Gamepad.getContentPane().add(x);
        x.setBounds(buttonSize * 2, buttonSize, buttonSize, buttonSize);
        x.addActionListener(new MyActionListener());

        JButton y = new JButton("y");
        Gamepad.getContentPane().add(y);
        y.setBounds(buttonSize * 3, buttonSize, buttonSize, buttonSize);
        y.addActionListener(new MyActionListener());

        JButton z = new JButton("z");
        Gamepad.getContentPane().add(z);
        z.setBounds(buttonSize * 3, buttonSize, buttonSize, buttonSize);
        z.addActionListener(new MyActionListener());

        JButton M = new JButton("!R");
        Gamepad.getContentPane().add(M);
        M.setBounds(buttonSize * 4, 0, buttonSize, buttonSize);
        M.addActionListener(new MyActionListener());

        JButton face = new JButton("Face");
        Gamepad.getContentPane().add(face);
        face.setBounds(buttonSize * 4, buttonSize, buttonSize, buttonSize);
        face.addActionListener(new MyActionListener());
    }

    private void setLayout(FlowLayout flowLayout) {
    }

    private static class MyActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            moves move = new moves();
            positionSetting set = new positionSetting();
            screen cubesim = new screen();
            int face = cubesim.getface();
            String[][][] cube = cubesim.getcubedata();
            JButton button = (JButton) e.getSource();
            if (button.getText() == "U") {
                System.out.println("U");
                cubesim.setcubedata(move.U(cube, face));
            } else if (button.getText() == "D") {
                System.out.println("D");
                move.D(cube, face);
            } else if (button.getText() == "L") {
                System.out.println("L");
                move.L(cube, face);
            } else if (button.getText() == "R") {
                System.out.println("R");
                cubesim.setcubedata(move.R(cube, face));
            } else if (button.getText() == "F") {
                System.out.println("F");
                // move.F(cube, face);
            } else if (button.getText() == "B") {
                System.out.println("B");
                // move.B(cube, face);
            } else if (button.getText() == "x") {
                System.out.println("x");
            } else if (button.getText() == "y") {
                System.out.println("y");
            } else if (button.getText() == "z") {
                System.out.println("z");
            } else if (button.getText() == "!R") {
                System.out.println("!R");
                cubesim.setcubedata(set.Default());
            } else if (button.getText() == "Face") {
                System.out.println("Face");
                cubesim.setface();
            }

        }

    }
}