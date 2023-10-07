package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class GridLayoutNauka extends JFrame {
    public static void main(String[] args) {
        PodpowiedziToolTipIkonaAplikacji frame = new PodpowiedziToolTipIkonaAplikacji();
        frame.setLayout(new GridLayout(3, 3));

        for(int i = 1; i <= 9; i++) {
            JButton b = new JButton("" + i);
            frame.add(b);
        }

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
