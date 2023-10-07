package SwingNauka;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BorderLayoutNauka extends JFrame {
    public static void main(String[] args) {
        PodpowiedziToolTipIkonaAplikacji frame = new PodpowiedziToolTipIkonaAplikacji();

        // BorderLayout - manageg układów elementów, domyślny układ w JFrame 5 dostępnych regionów każdy z nich może posiadać 1 element
        Border border = BorderFactory.createLineBorder(Color.black);

        JLabel north = new JLabel("North", JLabel.CENTER);
        north.setBorder(border);
        JLabel west = new JLabel("West", JLabel.CENTER);
        west.setBorder(border);
        JLabel center = new JLabel("Center", JLabel.CENTER);
        center.setBorder(border);
        JLabel east = new JLabel("East", JLabel.CENTER);
        east.setBorder(border);
        JLabel south = new JLabel("South", JLabel.CENTER);
        south.setBorder(border);
        frame.setLayout(new BorderLayout());

        frame.add(north, BorderLayout.NORTH);
        frame.add(west, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);
        frame.add(east, BorderLayout.EAST);
        frame.add(south, BorderLayout.SOUTH);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
