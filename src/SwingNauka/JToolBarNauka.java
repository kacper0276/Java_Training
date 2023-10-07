package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JToolBarNauka extends JFrame {
    public static void main(String[] args) {
        JToolBarNauka frame = new JToolBarNauka();

        JToolBar toolBar = new JToolBar();
        JButton file = new JButton("File");
        toolBar.add(file);
        toolBar.addSeparator();
        JButton edit = new JButton("Edit");
        toolBar.add(edit);
        JToggleButton tButton = new JToggleButton("Toggle");
        toolBar.add(tButton);

        frame.add(toolBar);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
