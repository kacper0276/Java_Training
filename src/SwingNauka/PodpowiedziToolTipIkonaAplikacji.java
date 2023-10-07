package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class PodpowiedziToolTipIkonaAplikacji extends JFrame {
    public static void main(String[] args) {
        PodpowiedziToolTipIkonaAplikacji frame = new PodpowiedziToolTipIkonaAplikacji();

        JTextField textField = new JTextField(10);
        textField.setToolTipText("Wpisz imię");
        frame.add(textField);

        Image icon = (new ImageIcon("files\\img\\aaa.jpg")).getImage();
        frame.setIconImage(icon);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
