package SwingNauka;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class JTabbedPaneZakladkiNauka extends JFrame {
    public static void main(String[] args) {
        JTabbedPaneZakladkiNauka frame = new JTabbedPaneZakladkiNauka();

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p1 = new JPanel();
        p1.add(new JTextArea(10, 10));
        tabbedPane.add("One", p1);

        JPanel p2 = new JPanel();
        p2.add(new JButton("Test"));
        tabbedPane.add("Two", p2);

        tabbedPane.setSelectedIndex(0);
        System.out.println("Selected index: " + tabbedPane.getSelectedIndex());

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JTabbedPane pane = (JTabbedPane) e.getSource();
                System.out.println("Pane Selected: " + pane.getTitleAt(pane.getSelectedIndex()) + "  "  + pane.getSelectedIndex());
            }
        });

        frame.add(tabbedPane);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
