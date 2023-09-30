package SwingNauka;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ZdarzeniaMyszy extends JFrame implements MouseListener, MouseMotionListener {
    // MouseListener
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked: " + e.getX() + "  " + e.getY());
        System.out.println("Clicked: " + e.getClickCount());
        System.out.println("Screen: " + e.getXOnScreen() + "  " + e.getYOnScreen());
        System.out.println("Button: " + e.getButton());

        switch (e.getButton()) {
            case MouseEvent.BUTTON1:
                System.out.println("Button Lewy");
                break;
            case MouseEvent.BUTTON2:
                System.out.println("Button Kółko");
                break;
            case MouseEvent.BUTTON3:
                System.out.println("Button Prawy");
                break;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public static void main(String[] args) {
        ZdarzeniaMyszy frame = new ZdarzeniaMyszy();
        frame.addMouseListener(frame);
        frame.addMouseMotionListener(frame);

        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // MouseMotionListener
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Moved: " + e.getX() + "  " + e.getY());
    }
}
