package SwingNauka;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldNauka extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JTextField) {
            JTextField t = (JTextField) e.getSource();
            System.out.println(t.getText());
        }
    }

    public static void main(String[] args) {
        JTextFieldNauka frame = new JTextFieldNauka();
        frame.setLayout(new FlowLayout());

        JTextField t1 = new JTextField("Example Text", 10);
        t1.setText("Nowy tekst");
        System.out.println(t1.getText());
        t1.setFont(new Font(Font.SERIF, Font.BOLD, 12));
        t1.addActionListener(frame);

        // Bez klikania enter
        t1.getDocument().addDocumentListener(
                new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        System.out.println("Text inserted: " + t1.getText());
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        System.out.println("Text removed: " + t1.getText());
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        System.out.println("Text style changed");
                    }
                }
        );

        frame.add(t1);
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
