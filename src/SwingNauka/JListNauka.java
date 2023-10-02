package SwingNauka;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class JListNauka extends JFrame {
    public static void main(String[] args) {
        JListNauka frame = new JListNauka();
        DefaultListModel<String> df = new DefaultListModel<>();
        df.addElement("Java");
        df.addElement("C++");
        df.addElement("PHP");
        df.addElement("JS");
        JList<String> list = new JList<>(df);
        frame.add(list);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) return;
                int selectedIndicies[] = list.getSelectedIndices();
                Arrays.stream(selectedIndicies)
                        .forEach(i -> System.out.println(list.getModel().getElementAt(i)));
            }
        });

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
