package SwingNauka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JMenuBarNauka extends JFrame {
    public static void main(String[] args) {
        JMenuBarNauka frame = new JMenuBarNauka();

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem close = new JMenuItem("Close");
        file.add(close);

        JMenu edit = new JMenu("Edit");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        JCheckBoxMenuItem checkbox = new JCheckBoxMenuItem("Checkbox");

        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Radio1", true);
        JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Radio2");
        group.add(radio1);
        group.add(radio2);

        edit.add(copy);
        edit.addSeparator();
        edit.add(paste);
        edit.add(checkbox);
        edit.addSeparator();
        edit.add(radio1);
        edit.add(radio2);

        menuBar.add(file);
        menuBar.add(edit);
        JMenu submenu = new JMenu("Sub menu");
        JMenuItem item1 = new JMenuItem("Item 1");
        submenu.add(item1);
        file.add(submenu);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if(e.getSource().equals(close)) {
                    System.exit(0);
                }
                if(e.getSource().equals(checkbox)) {
                    System.out.println(checkbox.isSelected());
                }
                if(e.getSource() instanceof JRadioButtonMenuItem) {
                    JRadioButtonMenuItem r = (JRadioButtonMenuItem) e.getSource();
                    System.out.println("Selected: " + r.getText());
                }
                if(source instanceof JMenuItem) {
                    System.out.println(((JMenuItem)source).getText());
                }
            }
        };

        frame.setJMenuBar(menuBar);

        close.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);
        item1.addActionListener(listener);
        checkbox.addActionListener(listener);
        radio1.addActionListener(listener);
        radio2.addActionListener(listener);

        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
