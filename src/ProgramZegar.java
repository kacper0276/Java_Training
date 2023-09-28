import javax.swing.*;
import java.time.LocalDateTime;

public class ProgramZegar extends JFrame implements Runnable {
    private Thread thread;
    String hour, minutes, seconds;
    JLabel label;

    public ProgramZegar() {
        label = new JLabel("", JLabel.CENTER);
        label.setBounds(5, 5, 100, 40);
        add(label);
        setSize(100, 80);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        try {
            while (true) {
                LocalDateTime today = LocalDateTime.now();
                hour = "" + today.getHour();
                minutes = String.format("%02d", today.getMinute()); // Automatyczne dodawanie 0
                seconds = String.format("%02d", today.getSecond());

                label.setText(hour + ":" + minutes + ":" + seconds);
                thread.sleep(1000);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ProgramZegar clock = new ProgramZegar();
    }
}
