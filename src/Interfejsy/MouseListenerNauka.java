package Interfejsy;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerNauka extends JFrame implements MouseListener {
    private JLabel label;
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        String str = "Mouse Clicked " + "at x: " + x + " - y: " + y;
        label.setText(str);
        System.out.println("Mouse Clicked " + "at x: " + x + " - y: " + y );
    }

    public MouseListenerNauka() {
        label = new JLabel("-----");
        label.setBounds(10, 10, 250, 50);
        this.add(label);
    }

    // JFrameExample c.d.
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        MouseListenerNauka frame = new MouseListenerNauka();
        frame.setSize(250, 200);
        frame.setTitle("JFrame test");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.addMouseListener(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
