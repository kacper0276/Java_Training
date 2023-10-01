package SwingNauka;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JLabelNauka extends JFrame {
    public static void main(String[] args) {
        JLabelNauka frame = new JLabelNauka();

        JLabel label = new JLabel("Tekst label.");
        label.setForeground(Color.green);
        label.setOpaque(true); // Nieprzezroczysty
        // wymaga opaque = true
        label.setBackground(Color.white);
        label.setText("Nowy tekst");
        label.setBounds(5, 5, 100, 30);
        frame.add(label);

        JLabel label2 = new JLabel("<html> <u>Drugi</u> </html>");
        label2.setBounds(110, 5, 60, 30);
        // Wycentrowane horyzontalnie
        label2.setHorizontalAlignment(JLabel.CENTER);

        Border border = BorderFactory.createLineBorder(Color.RED, 3);
        label.setBorder(border);

        frame.add(label2);
        frame.setLayout(null);
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
