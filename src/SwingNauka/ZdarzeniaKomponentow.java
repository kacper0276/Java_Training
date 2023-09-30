package SwingNauka;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZdarzeniaKomponentow extends JFrame implements ActionListener {
    JButton button;
    JButton button2;
    JButton button3;

    public void actionPerformed(ActionEvent e) {
        if(button.equals(e.getSource())) {
            System.out.println("Button kliknięty");
        }
        if(button2.equals(e.getSource())) {
            System.out.println("Button 2 Kliknięty");
        }
    }

    public void initUi() {
        this.setLayout(new GridLayout());
        button = new JButton("Click me");
        button.addActionListener(this); // Wskazujemy do jakiej klasy będzie przekazywana informacja o klikięciu
        this.add(button);

        button2 = new JButton("Button 2");
        button2.addActionListener(this);
        this.add(button2);

        button3 = new JButton("Button 3");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button 3 Clicked!");
            }
        });
        this.add(button3);
    }

    public static void main(String[] args) {
        ZdarzeniaKomponentow frame = new ZdarzeniaKomponentow();
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.initUi();
        frame.setLocationRelativeTo(null); // Wycentrowany
        frame.setVisible(true);
    }
}
