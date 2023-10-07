package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToggleButtonNauka extends JFrame {
    public static void main(String[] args) {
        JToggleButtonNauka frame = new JToggleButtonNauka();

        JToggleButton b1 = new JToggleButton("Toggle button");
        b1.setFont(new Font("Arial", Font.PLAIN, 12));

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked: " + b1.isSelected());
            }
        });

        frame.add(b1);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
