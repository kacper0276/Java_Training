package SwingNauka;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderNauka extends JFrame {
    public static void main(String[] args) {
        JSliderNauka frame = new JSliderNauka();


        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0 , 100, 30);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                System.out.println("Slider: " + value);
            }
        });

        frame.add(slider);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
