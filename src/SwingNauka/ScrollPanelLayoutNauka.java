package SwingNauka;

import javax.swing.*;

public class ScrollPanelLayoutNauka extends JFrame {
    public static void main(String[] args) {
        ScrollPanelLayoutNauka frame = new ScrollPanelLayoutNauka();

        JLabel label = new JLabel(new ImageIcon("files\\img\\aaa.jpg"));
        JScrollPane scrollPane = new JScrollPane(label);
        frame.add(scrollPane);

        frame.setSize(200, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
