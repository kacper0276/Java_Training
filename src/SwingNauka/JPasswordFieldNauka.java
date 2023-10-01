package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldNauka extends JFrame implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JPasswordField) {
            JPasswordField pf = (JPasswordField) e.getSource();
            System.out.println(new String(pf.getPassword())); // getPassword() zwraca tablicę char
        }
    }

    public static void main(String[] args) {
        JPasswordFieldNauka frame = new JPasswordFieldNauka();
        frame.setLayout(new FlowLayout());

        // Konstruktor ilości kolumn
        JPasswordField pf = new JPasswordField(10);
        pf.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        pf.addActionListener(frame);
        frame.add(pf);
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
