package SwingNauka;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class JEditorPaneNauka extends JFrame {
    public static void main(String[] args) {
        JEditorPaneNauka frame = new JEditorPaneNauka();

        // Prosty edytor tekstowy
        JEditorPane editorPane = new JEditorPane(
                "text/html", // text/plain - zwykły tekst
                "<html><h4>Title</h4><p>lorem ipsum" +
                        " lorem ipsum </p> </html>"
        );

        editorPane.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(editorPane);

        editorPane.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("Insert: " + editorPane.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("Remove: " + editorPane.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("Change: " + editorPane.getText());
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
