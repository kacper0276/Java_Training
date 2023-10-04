package SwingNauka;

import javax.swing.*;

public class JOptionPaneNauka extends JFrame {
    public static void main(String[] args) {
        JOptionPaneNauka frame = new JOptionPaneNauka();

        String msg = "<html>Some <u>important</u> message to user! </html>";

        ImageIcon icon = new ImageIcon("files//j.png");
        JOptionPane.showMessageDialog(null, // Bez okna właściciela
                msg, // Wiadomość
                "Message title", // Tytuł okna dialogowego
                JOptionPane.ERROR_MESSAGE, // Rodzaj komunikacji,
                icon
                );

        // Okno z ikoną błędu powiązane z JFrame
        JOptionPane.showMessageDialog(frame, "Hello world", "Alert", JOptionPane.ERROR_MESSAGE);
    }
}
