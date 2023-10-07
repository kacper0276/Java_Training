package SwingNauka;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class JTextPaneStylowanyDokumentNauka extends JFrame {
    public static void main(String[] args) throws Exception {
        JTextPaneStylowanyDokumentNauka frame = new JTextPaneStylowanyDokumentNauka();

        JTextPane textPane = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(textPane);
        frame.add(scrollPane, BorderLayout.CENTER);

        textPane.setText("Lorem ipsum, lorem ipsum");

        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
        StyleConstants.setBold(attributeSet, true); // true ustawi atrybut
        StyleConstants.setItalic(attributeSet, true);
        StyleConstants.setBackground(attributeSet, Color.lightGray);
        StyleConstants.setForeground(attributeSet, Color.blue);

        textPane.getDocument().insertString(0, "Hello World ", attributeSet);

        textPane.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Insert: " + textPane.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Remove: " + textPane.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Change: " + textPane.getText());
            }
        });

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
