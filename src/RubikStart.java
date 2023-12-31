
import Display.screen;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

import controls.*;

class RubikStart {
    public static void sleepy() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello im RubikMessBox!");
        System.out.println("I am a Rubik's Cube simulator!");
        System.out.println("I am made by James lee Hill!");
        sleepy();
        System.out.println("Its still in Development demo");
        sleepy();
        System.out.println("Please enjoy!");
        System.out.println("------------------------");
        System.out.println("|       |///////|       |");
        System.out.println("|       |///////|       |");
        System.out.println("|       |///////|       |");
        System.out.println("|///////|///////|///////|");
        System.out.println("|///////|/|RMB|/|///////|");
        System.out.println("|///////|///////|///////|");
        System.out.println("|       |///////|       |");
        System.out.println("|       |///////|       |");
        System.out.println("|       |///////|       |");
        System.out.println("------------------------");

        // JFrame

        JFrame windowFrame = new JFrame();
        windowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowFrame.setResizable(false);
        windowFrame.setTitle("RubicMessBox");
        screen game = new screen();
        windowFrame.add(game);
        BufferedImage logo = null;
        try {
            logo = ImageIO.read(new File(
                    "C:\\Users\\James\\OneDrive\\Desktop\\Coding Folder\\RubikMessBox\\src\\res\\RMBlogo.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ImageIcon img = new ImageIcon(
                "C:\\Users\\James\\OneDrive\\Desktop\\Coding Folder\\RubikMessBox\\src\\res\\RMBlogo.png");
        windowFrame.setIconImage(img.getImage());

        windowFrame.pack();

        windowFrame.setLocationRelativeTo(null);
        windowFrame.setVisible(true);

        game.startGthread();

        notationreader notations = new notationreader();
        notations.Reader();

        rotationStation controller = new rotationStation();
        controller.createStation();

        // ===========================================================================

        // Define the desired width and height of the resized image
        int desiredWidth = 300;
        int desiredHeight = 300;

        // Create a resized image using the original image and desired dimensions
        BufferedImage resizedImage = new BufferedImage(desiredWidth, desiredHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImage.createGraphics();
        g2.drawImage(logo, 0, 0, desiredWidth, desiredHeight, null);
        g2.dispose();

        // Display the resized image
        JFrame frame = new JFrame("RMB(Rubiks Mess Box)");
        frame.getContentPane().add(new JLabel(new ImageIcon(resizedImage)));
        frame.pack();
        frame.setVisible(true);
    }
}