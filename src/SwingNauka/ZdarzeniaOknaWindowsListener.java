package SwingNauka;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;

public class ZdarzeniaOknaWindowsListener extends JFrame implements WindowListener {
    public void windowOpened(WindowEvent e) {
        System.out.println("Okno otwarte");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Okno zamykane");
        this.dispose(); // Zwolnione natywne zasoby
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Okno zamknięte");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Zminimalizowane");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Pokazane");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Okno aktywowane");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Okno deaktywowane");
    }

    public static void main(String[] args) {
        ZdarzeniaOknaWindowsListener frame = new ZdarzeniaOknaWindowsListener();
        frame.addWindowListener(frame);

        frame.addWindowFocusListener(new WindowFocusListener() {
            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("Window Get Focus");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("Window Lost Focus");
            }
        });

        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
