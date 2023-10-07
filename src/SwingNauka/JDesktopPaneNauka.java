package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JDesktopPaneNauka extends JFrame {
    public static void main(String[] args) {
        JDesktopPaneNauka frame = new JDesktopPaneNauka();

        // Umożliwia utworzenie wielodokumentowej aplikacji w Java
        JDesktopPane desktop = new JDesktopPane();
        JInternalFrame internalFrame = new JInternalFrame(
                "Internal Frame 1", // Title
                true, // Resizable
                true, // closable
                true // maximizable
        );
        desktop.add(internalFrame);

        internalFrame.setBounds(25, 25, 200, 100);
        JLabel label = new JLabel("Internal Frame 1", JLabel.CENTER);
        internalFrame.add(label);

        internalFrame.setVisible(true);
        frame.add(desktop, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
