package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonNauka extends JFrame {

    public static void main(String[] args) {
        JRadioButtonNauka frame = new JRadioButtonNauka();
        JRadioButton b1 = new JRadioButton("Car");
        JRadioButton b2 = new JRadioButton("Plane");
        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        frame.add(b1);
        frame.add(b2);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton b = (JRadioButton) e.getSource();
                System.out.println("Clicked: " + b.getText());
                System.out.println("car selected: " + b1.isSelected());
                System.out.println("plane selected: " + b2.isSelected());
            }
        };
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);

        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
