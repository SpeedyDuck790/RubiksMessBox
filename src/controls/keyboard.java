package controls;

import Actions.*;
import Display.screen;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboard implements KeyListener {
    public boolean UPressed, DPressed, LPressed, RPressed, FPressed, BPressed, xPressed, yPressed, zPressed,
            resetPressed, newfacepressed, switched, testingRotation, testingFanB, Alt;

    public boolean UPressed2, DPressed2, LPressed2, RPressed2, FPressed2, BPressed2, xPressed2, yPressed2, zPressed2;;

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
            if (Alt) {
                UPressed2 = true;
            } else {
                UPressed = true;
            }
        }

        if (key == KeyEvent.VK_W) {// D
            if (Alt) {
                DPressed2 = true;
            } else {
                DPressed = true;
            }
        }

        if (key == KeyEvent.VK_E) {// L
            if (Alt) {
                LPressed2 = true;
            } else {
                LPressed = true;
            }
        }

        if (key == KeyEvent.VK_R) {// R
            if (Alt) {
                RPressed2 = true;
            } else {
                RPressed = true;
            }
        }
        if (key == KeyEvent.VK_S) {// F
            if (Alt) {
                FPressed2 = true;
            } else {
                FPressed = true;
            }
        }
        if (key == KeyEvent.VK_D) {// B
            if (Alt) {
                BPressed2 = true;
            } else {
                BPressed = true;
            }
        }

        if (key == KeyEvent.VK_A) {// newface
            newfacepressed = true;
        }

        if (key == KeyEvent.VK_F) {// reset
            resetPressed = true;
        }
        if (key == KeyEvent.VK_T) {// x
            if (Alt) {
                xPressed2 = true;
            } else {
                xPressed = true;
            }
        }
        if (key == KeyEvent.VK_G) {// y
            if (Alt) {
                yPressed2 = true;
            } else {
                yPressed = true;
            }
        }
        if (key == KeyEvent.VK_B) {// z
            if (Alt) {
                zPressed2 = true;
            } else {
                zPressed = true;
            }
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
            UPressed2 = false;
        }
        if (key == KeyEvent.VK_W) {// D
            DPressed = false;
            DPressed2 = false;
        }
        if (key == KeyEvent.VK_E) {// L
            LPressed = false;
            LPressed2 = false;
        }
        if (key == KeyEvent.VK_R) {// R
            RPressed = false;
            RPressed2 = false;
        }
        if (key == KeyEvent.VK_S) {// F
            FPressed = false;
            FPressed2 = false;

        }
        if (key == KeyEvent.VK_D) {// B
            BPressed = false;
            BPressed2 = false;
        }
        if (key == KeyEvent.VK_A) {// newface
            newfacepressed = false;

        }

        if (key == KeyEvent.VK_F) {// reset
            resetPressed = false;
        }
        if (key == KeyEvent.VK_T) {// x
            xPressed = false;
            xPressed2 = false;
        }
        if (key == KeyEvent.VK_G) {// y
            yPressed = false;
            yPressed2 = false;
        }
        if (key == KeyEvent.VK_B) {// z
            zPressed = false;
            zPressed2 = false;
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
