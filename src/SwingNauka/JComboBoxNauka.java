package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComboBoxNauka extends JFrame {

    public static void main(String[] args) {
        JComboBoxNauka frame = new JComboBoxNauka();

        String prog[] = {"Java", "C++", "Php", "JavaScript"};
        JComboBox cb = new JComboBox(prog);

        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("selected: " + prog[cb.getSelectedIndex()]);
            }
        });
        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state = e.getStateChange();
                if(state == ItemEvent.SELECTED) {
                    System.out.println(e.getItem() + " selected"); // Zaznaczone
                } else if(state == ItemEvent.DESELECTED) {
                    System.out.println(e.getItem() + " deselected"); // Odznaczone (Poprzednia zaznaczona opcja)
                }
            }
        });

        frame.add(cb);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
