package SwingNauka;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;

public class JFileChooserNauka extends JFrame {
    public static void main(String[] args) {
        JFileChooserNauka frame = new JFileChooserNauka();

        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Files", "mp4", "dat", "txt", "zip");
        fc.addChoosableFileFilter(filter);
        int result = fc.showOpenDialog(null);

        switch (result) {
            case JFileChooser.APPROVE_OPTION:
                File file = fc.getSelectedFile();
                System.out.println(file.getAbsolutePath());
                break;
            case JFileChooser.CANCEL_OPTION:
                System.out.println("Canceled clicked");
                break;
            case JFileChooser.ERROR_OPTION:
                System.out.println("Filechooser error");
                break;
        }

        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
