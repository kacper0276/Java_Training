package MiniProjektKalkulator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestCalculator {
    private JLabel screen;
    private boolean start;
    private String lastCommand;
    private double result;

    public TestCalculator() {
        start = true;
        lastCommand = "=";
        JFrame frame = new JFrame();
        screen = new JLabel("0", JLabel.RIGHT);
        screen.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(screen, BorderLayout.NORTH);

        frame.add(makeButtonsPanel(), BorderLayout.CENTER);

        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private JPanel makeButtonsPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String buttons[] = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for(int i = 0; i < buttons.length; i++) {
            panel.add(addButton(buttons[i]));
        }

        return panel;
    }

    private JButton addButton(String name) {
        JButton b = new JButton(name);
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.addActionListener(calcListener);
        return b;
    }

    private ActionListener calcListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String v = ((JButton)e.getSource()).getText();
            if("/+-*=".indexOf(v) >= 0) {
                calculate(v);
            } else {
                insertNumber(v);
            }
        }
    };

    public void calculate(String s) {
        System.out.println("Calculate: " + s);

        double num = Double.parseDouble(screen.getText());
        if(lastCommand.equals("=")) result = num;
        if(lastCommand.equals("+")) result += num;
        if(lastCommand.equals("-")) result -= num;
        if(lastCommand.equals("*")) result *= num;
        if(lastCommand.equals("/")) result /= num;
        screen.setText("" + result);
        lastCommand = s;
        start = true;
    }

    public void insertNumber(String n) {
        System.out.println("Insert: " + n);
        if(start) {
            screen.setText(n);
            start = false;
        } else {
            screen.setText(screen.getText() + n);
        }
    }

    public static void main(String[] args) {
        TestCalculator calc = new TestCalculator();
    }
}
