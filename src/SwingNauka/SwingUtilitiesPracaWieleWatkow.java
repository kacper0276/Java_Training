package SwingNauka;

import javax.swing.*;
import java.awt.*;

class ProgressElement implements Runnable {
    private JProgressBar progress;

    public ProgressElement() {
        progress = new JProgressBar();
        progress.setMinimum(0);
        progress.setMaximum(100);
    }

    public JProgressBar getProgress() {
        return progress;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 100; i+= 10) {
            try {
                Thread.sleep(250);
                updateProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateProgress(int progressNumber) {
        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        progress.setValue(progressNumber);
                    }
                }
        );
    }
}

public class SwingUtilitiesPracaWieleWatkow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        ProgressElement progressElement = new ProgressElement();
        frame.add(progressElement.getProgress());

        Thread t = new Thread(progressElement);
        t.start();

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
