package SwingNauka;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ZdarzeniaKlawiatury extends JFrame implements KeyListener {
    public void keyTyped(KeyEvent e) { // Kiedy napisze znak
        System.out.println("keyTyped: " + e.getKeyChar());
    }

    public void keyPressed(KeyEvent e) { // Kiedy naciśnie przycisk
        System.out.println("keyPressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) { // Kiedy puści znak
        System.out.println("keyReleased: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        ZdarzeniaKlawiatury frame = new ZdarzeniaKlawiatury();
        frame.addKeyListener(frame);

        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
