package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JScrollPaneNauka extends JFrame {
    public static void main(String[] args) {
        JScrollPaneNauka frame = new JScrollPaneNauka();
        JTextArea area = new JTextArea(7, 12);

        // Komponent do przewijania który może pomieścić inny większy komponent
        JScrollPane scrollPane = new JScrollPane(area);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
