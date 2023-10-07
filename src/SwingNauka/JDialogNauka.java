package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogNauka extends JFrame {
    public static void main(String[] args) {
        JDialogNauka frame = new JDialogNauka();

        // Modalne okno - Okno modalne – okno nie pozwalające na obsługę zdarzeń dotyczących pozostałych okien danej aplikacji. Wówczas żadne inne okno aplikacji nie reaguje na działania użytkownika.

        JDialog dialog = new JDialog(frame, "Dialog example", true);
        dialog.setLayout(new FlowLayout());

        JButton dialogButton = new JButton("Close dialog");
        dialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });

        dialog.add(dialogButton);
        dialog.setSize(300, 300);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dialog.setVisible(true);
    }
}
