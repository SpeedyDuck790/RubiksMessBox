package controls;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JMenu;
// import javax.swing.JMenuBar;
// import javax.swing.JMenuItem;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
import javax.swing.JTextArea;
// import javax.swing.JTextField;

import Actions.moves;
import Actions.output;
import Display.screen;

public class notationreader {
    static String inputString = "";

    public void Reader() {
        // creating buttonbox
        JFrame frame = new JFrame("Notaion Reader");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea notationArea = new JTextArea();
        frame.getContentPane().add(BorderLayout.CENTER, notationArea);
        JButton button1 = new JButton("Go!");
        frame.getContentPane().add(BorderLayout.SOUTH, button1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                inputString = notationArea.getText();
                Combinationpreformer(inputString);

            }
        });
        // String inputString = JOptionPane.showInputDialog("Enter Notation");

        frame.setLocation(1500, 300);

        frame.setSize(250, 400);
        frame.setVisible(false);

    }

    public void Combinationpreformer(String input) {
        screen cubey = new screen();
        moves move = new moves();
        String[][][] cube = cubey.getcubedata();
        int face = screen.getface();
        String[] inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            switch (inputArray[i]) {
                case "U":
                    System.out.println("U");
                    move.U(cube, face);
                    break;
                case "U'":
                    System.out.println("U'");
                    break;
                case "D":
                    System.out.println("D");
                    break;
                case "D'":
                    System.out.println("D'");
                    break;
                case "L":
                    System.out.println("L");
                    break;
                case "L'":
                    System.out.println("L'");
                    break;
                case "R":
                    System.out.println("R");
                    break;
                case "R'":
                    System.out.println("R'");
                    break;
                case "F":
                    System.out.println("F");
                    break;
                case "F'":
                    System.out.println("F'");
                    break;
                case "B":
                    System.out.println("B");
                    break;
                case "B'":
                    System.out.println("B'");
                    break;
                case "M":
                    System.out.println("M");
                    break;
                case "M'":
                    System.out.println("M'");
                    break;
                case "E":
                    System.out.println("E");
                    break;
                case "E'":
                    System.out.println("E'");
                    break;
                case "S":
                    System.out.println("S");
                    break;
                case "S'":
                    System.out.println("S'");
                    break;

            }
        }
        output output = new output();
        output.ShowCube(cube);
        cubey.setcubedata(cube);

    }
}