package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class JScrollBarNauka extends JFrame {
    public static void main(String[] args) {
        JScrollBarNauka frame = new JScrollBarNauka();

        JScrollBar scroll = new JScrollBar();

        JScrollBar horyzontalny = new JScrollBar(Adjustable.HORIZONTAL);

        scroll.setValue(30);
        scroll.addAdjustmentListener(
                new AdjustmentListener() {
                    @Override
                    public void adjustmentValueChanged(AdjustmentEvent e) {
                        if(e.getValueIsAdjusting()) return;
                        System.out.println("Scroll value: " + e.getValue());
                    }
                }
        );

        scroll.setPreferredSize(new Dimension(30, 160));
        scroll.setMinimum(0);
        scroll.setMaximum(100);

        horyzontalny.setValue(30);
        horyzontalny.addAdjustmentListener(
                new AdjustmentListener() {
                    @Override
                    public void adjustmentValueChanged(AdjustmentEvent e) {
                        if(e.getValueIsAdjusting()) return;
                        System.out.println("Scroll horizontal value: " + e.getValue());
                    }
                }
        );

        horyzontalny.setPreferredSize(new Dimension(160, 30));
        horyzontalny.setMinimum(0);
        horyzontalny.setMaximum(100);


        frame.add(scroll);
        frame.add(horyzontalny);

        frame.setLayout(new FlowLayout());
        frame.setSize(200, 200);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
