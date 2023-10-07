package SwingNauka;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPopupMenuNauka extends JFrame {
    public static void main(String[] args) {
        JPopupMenuNauka frame = new JPopupMenuNauka();

        JPopupMenu popup = new JPopupMenu("Edit");
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        popup.add(cut);
        popup.add(copy);
        popup.add(paste);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JMenuItem i = (JMenuItem)e.getSource();
                System.out.println(i.getText());
            }
        };

        cut.addActionListener(listener);
        copy.addActionListener(listener);
        paste.addActionListener(listener);

        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popup.show(frame, e.getX(), e.getY());
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}
