package SwingNauka;

import javax.swing.*;
import java.awt.*;

public class JTableNauka extends JFrame {
    public static void main(String[] args) {
        JTableNauka frame = new JTableNauka();
        String columns[] = {"Manufacturer", "Name", "Year"};
        String data[][] = {
                {"Ford", "Mustang", "1970"},
                {"Dodge", "Charger", "1971"},
                {"Ford", "Torino", "1971"}
        };
        JTable jt = new JTable(data, columns);

        // Aby scollPane pokazał horyzontalny scrollbar
        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane sp = new JScrollPane(jt);
        sp.setPreferredSize(new Dimension(300, 100));

        jt.setValueAt("1972", 0, 2);
        System.out.println("Ilość wierszy: " + jt.getRowCount());
        System.out.println("Ilość kolumn: " + jt.getColumnCount());
        System.out.println("Wartość 1 1: " + jt.getValueAt(1, 1));
        System.out.println("Kolumna 0: " + jt.getColumnName(0));
        frame.add(sp, BorderLayout.CENTER);

        // metoda pack() pakuje komponenty
        // ze względu na preferowane rozmiary
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
