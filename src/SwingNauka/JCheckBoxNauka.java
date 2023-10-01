package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyIcon implements Icon {
    Color color;
    String text;

    public MyIcon(String text, Color c) {
        this.text = text;
        this.color = c;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.drawString(this.text, 0, 10);
    }

    @Override
    public int getIconWidth() {
        return 32;
    }

    @Override
    public int getIconHeight() {
        return 32;
    }
}

public class JCheckBoxNauka extends JFrame {
    public static void main(String[] args) {
        JCheckBoxNauka frame = new JCheckBoxNauka();
        Icon normal = new MyIcon("Normal", Color.black);
        Icon rollover = new MyIcon("Rollover", Color.red);
        Icon selected = new MyIcon("Selected", Color.green);
        JCheckBox check1 = new JCheckBox(normal);
//        JCheckBox check1 = new JCheckBox("Opcja 1");
//        check1.setSelected(true);
        check1.setRolloverIcon(rollover);
        check1.setSelectedIcon(selected);

        check1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                switch (e.getStateChange()) {
                    case ItemEvent.SELECTED:
                        System.out.println("Checkbox selected");
                        break;
                    case ItemEvent.DESELECTED:
                        System.out.println("Checkbox deselected");
                        break;
                }
            }
        });

        frame.add(check1);
        frame.setSize(200, 100);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
