package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonNauka extends JFrame {
    public static void main(String[] args) {
        JButtonNauka frame = new JButtonNauka();
        JButton button = new JButton();
        button.setText("Przycisk 1");
        button.setBounds(5, 5, 100, 30);
        button.setFont(new Font("Arial", Font.PLAIN, 12));
//        button.setIcon(new ImageIcon("files\\img\\aaa.jpg"));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 1 Clicked");
                button.setEnabled(false);
            }
        });

        frame.add(button);
        frame.setLayout(null);
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
