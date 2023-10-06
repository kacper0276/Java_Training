package SwingNauka;

import javax.swing.*;

public class JOptionPaneSwojeOpcje extends JFrame {
    public static void main(String[] args) {
        String options[] = {"Save", "Load latest", "Delete", "Cancel"};

        int result = JOptionPane.showOptionDialog(
                null, // okno
                "What to do with project?", // komunikat
                "Project 001", // tytuł
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // bez ikony
                options, // Opcje do wyboru
                options[0] // Domyślna opcja
        );

        System.out.println(options[result]);

        JTextArea area = new JTextArea(8, 16);
        JTextField email = new JTextField(10);
        Object options2[] = {
                new JLabel("Email:"),
                email,
                "Send",
                "Cancel"
        };

        int result2 = JOptionPane.showOptionDialog(
                null,
                area, // treścią może być tablica elementów
                "Email template",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options2,
                options2[2]
        );

        System.out.println("Message: " + area.getText());
        System.out.println("Email: " + email.getText());
        System.out.println("Result2: " + result2);
    }
}
