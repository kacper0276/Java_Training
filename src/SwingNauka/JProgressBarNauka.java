package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JProgressBarNauka extends JFrame {
    public static void main(String[] args) {
        JProgressBarNauka frame = new JProgressBarNauka();

        JProgressBar progress = new JProgressBar();
        progress.setMinimum(0);
        progress.setMaximum(100);

        Thread t = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i = 0; i <= 100; i++) {
                            try {
                                Thread.sleep(250);
                                progress.setValue(i);
                                if(i >= 100) return;
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
        );

        t.start();
        frame.add(progress);

        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
