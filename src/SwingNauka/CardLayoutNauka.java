package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutNauka extends JFrame {
    public static void main(String[] args) {
        PodpowiedziToolTipIkonaAplikacji frame = new PodpowiedziToolTipIkonaAplikacji();

        // Zawiera wiele komponentów ale tylko jeden może być wyświetlony
        Container pane = frame.getContentPane();
        CardLayout layout = new CardLayout();
        pane.setLayout(layout);

        for(int i = 1; i <= 5; i++) {
            JButton b = new JButton("" + i);
            pane.add(b, "button"+i);
            final int num = i;
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int nextId = num + 1;
                    if(nextId > 5) nextId = 1;
                    layout.show(pane, "button"+nextId);
                }
            });
        }

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
