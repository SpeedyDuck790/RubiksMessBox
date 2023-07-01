package controls;

import Actions.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboard implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

        moves Combination = new moves();
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_Q) {// U
            // Combination.U();
        }
        if (key == KeyEvent.VK_W) {// D
            // Combination.D();
        }
        if (key == KeyEvent.VK_E) {// L
            // Combination.L();
        }
        if (key == KeyEvent.VK_R) {// R
            // Combination.R();
        }
        if (key == KeyEvent.VK_S) {// F
            // Combination.F();
        }
        if (key == KeyEvent.VK_D) {// B
            // Combination.B();
        }
        if (key == KeyEvent.VK_A) {// new face
            // Combination.newface();
        }
        if (key == KeyEvent.VK_F) {// reset

        }
        if (key == KeyEvent.VK_T) {// x
            // Combination.x();
        }
        if (key == KeyEvent.VK_G) {// y
            // Combination.y();
        }
        if (key == KeyEvent.VK_B) {// z
            // Combination.z();
        } else {
            System.out.println("Invalid key");

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

}
