package SwingNauka;

import javax.swing.*;

public class BoxLayoutNauka extends JFrame {
    public static void main(String[] args) {
        PodpowiedziToolTipIkonaAplikacji frame = new PodpowiedziToolTipIkonaAplikacji();

        // Ustawia komponenty horyzontalnie lub wertykalnie
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        for(int i = 1; i <= 5; i++) {
            JButton b = new JButton("" + i);
            frame.add(b);
        }

        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
