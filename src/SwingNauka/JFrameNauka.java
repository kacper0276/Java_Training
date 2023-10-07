package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JFrameNauka extends JFrame {
    public static void main(String[] args) {
        JFrameNauka frame = new JFrameNauka();
        frame.add(new JLabel("Label"));
        frame.add(new JButton("Button"));
        frame.add(new Button("Button"));

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
