package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JPanelNauka extends JFrame {
    public static void main(String[] args) {
        JPanelNauka frame = new JPanelNauka();

        // Najprostszy kontener rozszerzający JComponent
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.add(new Button("Click me!"));
        panel.add(new JLabel("Label"));
        panel.setPreferredSize(new Dimension(150, 150));

        frame.add(panel);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
