package SwingNauka;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSpinnerInputTextNauka extends JFrame {
    public static void main(String[] args) {
        JSpinnerInputTextNauka frame = new JSpinnerInputTextNauka();

        SpinnerNumberModel spinnerNumberModel = new SpinnerNumberModel(
                5, // Wartość początkowa
                0, // Wartość minimalna
                20, // Wartość maksymalna
                1 // Przeskok
        );

        JSpinner spinner = new JSpinner(spinnerNumberModel);
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println(spinner.getValue());
            }
        });

        frame.add(spinner);

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
