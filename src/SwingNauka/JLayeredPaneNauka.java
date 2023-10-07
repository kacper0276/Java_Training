package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JLayeredPaneNauka extends JFrame {
    public static void main(String[] args) {
        JLayeredPaneNauka frame = new JLayeredPaneNauka();

        // Klasa dodająca głębi aplikacjom (Zależne od z-index)
        JLayeredPane layeredPane = frame.getLayeredPane();

        JButton b1 = new JButton();
        b1.setBounds(10, 10, 50, 50);
        b1.setBackground(Color.BLUE);
        layeredPane.add(b1, 10);

        JButton b2 = new JButton();
        b2.setBounds(30, 30, 50, 50);
        b2.setBackground(Color.RED);
        layeredPane.add(b2, 7);

        JButton b3 = new JButton();
        b3.setBounds(50, 10, 50, 50);
        b3.setBackground(Color.GRAY);
        layeredPane.add(b3, 6);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
