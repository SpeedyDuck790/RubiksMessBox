package controls;

import Actions.*;
import Display.screen;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboard implements KeyListener {
    public boolean UPressed, DPressed, LPressed, RPressed, FPressed, BPressed, xPressed, yPressed, zPressed,
            resetPressed, newfacepressed, switched, testingRotation, testingFanB, Alt;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SHIFT) {// Alt for * '
            Alt = true;
        }

        if (key == KeyEvent.VK_Q) {// U
            UPressed = true;
        }
        if (key == KeyEvent.VK_W) {// D
            DPressed = true;
        }
        if (key == KeyEvent.VK_E) {// L
            LPressed = true;
        }
        if (key == KeyEvent.VK_R) {// R
            RPressed = true;
        }
        if (key == KeyEvent.VK_S) {// F
            FPressed = true;
        }
        if (key == KeyEvent.VK_D) {// B
            BPressed = true;
        }
        if (key == KeyEvent.VK_A) {// newface
            newfacepressed = true;
        }

        if (key == KeyEvent.VK_F) {// reset
            resetPressed = true;
        }
        if (key == KeyEvent.VK_T) {// x
            xPressed = true;
        }
        if (key == KeyEvent.VK_G) {// y
            yPressed = true;
        }
        if (key == KeyEvent.VK_B) {// z
            zPressed = true;
        }
        if (key == KeyEvent.VK_1) {// switched
            switched = true;
        }
        if (key == KeyEvent.VK_2) {// switched
            testingRotation = true;
        }
        if (key == KeyEvent.VK_3) {// switched
            testingFanB = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SHIFT) {
            Alt = false;
        }

        if (key == KeyEvent.VK_Q) {// U
            UPressed = false;
        }
        if (key == KeyEvent.VK_W) {// D
            DPressed = false;
        }
        if (key == KeyEvent.VK_E) {// L
            LPressed = false;
        }
        if (key == KeyEvent.VK_R) {// R
            RPressed = false;
        }
        if (key == KeyEvent.VK_S) {// F
            FPressed = false;
        }
        if (key == KeyEvent.VK_D) {// B
            BPressed = false;
        }
        if (key == KeyEvent.VK_A) {// newface
            newfacepressed = false;
        }

        if (key == KeyEvent.VK_F) {// reset
            resetPressed = false;
        }
        if (key == KeyEvent.VK_T) {// x
            xPressed = false;
        }
        if (key == KeyEvent.VK_G) {// y
            yPressed = false;
        }
        if (key == KeyEvent.VK_B) {// z
            zPressed = false;
        }
        if (key == KeyEvent.VK_1) {// switched
            switched = false;
        }
        if (key == KeyEvent.VK_2) {// switched
            testingRotation = false;
        }
        if (key == KeyEvent.VK_3) {// switched
            testingFanB = false;
        }

    }

}
