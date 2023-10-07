package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JSplitPaneNauka extends JFrame {
    public static void main(String[] args) {
        JSplitPaneNauka frame = new JSplitPaneNauka();

        String cars[] = {"Dodge", "Ford", "GMC"};
        JComboBox<String> combo1 = new JComboBox<>(cars);
        JPanel panel1 = new JPanel();
        panel1.add(combo1);

        String bikes[] = {"Honda", "BMW", "Kawasaki"};
        JComboBox<String> combo2 = new JComboBox<>(bikes);
        JPanel panel2 = new JPanel();
        panel2.add(combo2);

        // Mieści dwa elementy którym można przydzielać miejsce w zależności od potrzeby
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,
                panel1, panel2
        );
        splitPane.setPreferredSize(new Dimension(250, 100));

        frame.add(splitPane);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
