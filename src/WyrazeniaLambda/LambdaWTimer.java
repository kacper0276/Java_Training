package WyrazeniaLambda;

import javax.swing.*;
import java.util.Date;

public class LambdaWTimer extends JFrame {
    public static void main(String args[]) {
        LambdaWTimer frame = new LambdaWTimer();

        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JLabel label = new JLabel();
        frame.add(label);

        // Timer == interval
        var t = new Timer(1000, event -> {
            Date d = new Date();
            label.setText(d.toString());
            System.out.println(d.toString());
        });
        t.start();
    }
}
