package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JColorChooserNauka extends JFrame {
    public static void main(String[] args) {
        JColorChooserNauka frame = new JColorChooserNauka();

        Color startcolor = Color.red;
        Color newColor = JColorChooser.showDialog(frame, "Select a color", startcolor);

        System.out.println("New color: " + newColor);

        JLabel label = new JLabel("Test");
        label.setForeground(newColor);
        frame.add(label);

        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
