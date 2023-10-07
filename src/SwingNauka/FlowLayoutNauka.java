package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutNauka extends JFrame {
    public static void main(String[] args) {
        PodpowiedziToolTipIkonaAplikacji frame = new PodpowiedziToolTipIkonaAplikacji();

        // Komponenty ułożony w wierszu, gdy jest za mało miejsca pojawiają się kolejne wiersze
        // Wyrównanie określa się jedną ze stałych np. FlowLayout.RIGHT
        frame.setLayout(new FlowLayout());
//        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));

        for(int i = 1; i <= 6; i++) {
            JButton button = new JButton("" + i);
            frame.add(button);
        }

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
