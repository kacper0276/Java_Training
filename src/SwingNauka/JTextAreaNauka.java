package SwingNauka;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JTextAreaNauka extends JFrame {
    public static void main(String[] args) {
        JTextAreaNauka frame = new JTextAreaNauka();
        frame.setLayout(new FlowLayout());

        // Konstruktor (ilość: wierszy, kolumn)
        JTextArea t = new JTextArea(3, 14);

        // Automatyczne zawijanie wierszy
        t.setLineWrap(true);

        // Dodanie tekstu na koniec
        t.append("Tekst w text area");

        // Wstawienie tekstu na pozycji 0
        t.insert("Nowy", 0);

        // Belki przewijania dla pola tekstowego
        JScrollPane scrollPane = new JScrollPane(t);

        t.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("TextArea inserted: " + t.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("TextArea removed: " + t.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("TextArea update: " + t.getText());
            }
        });

        frame.add(scrollPane);
//        frame.add(t);

        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
