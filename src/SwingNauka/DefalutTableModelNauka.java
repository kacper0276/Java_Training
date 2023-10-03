package SwingNauka;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class DefalutTableModelNauka extends JFrame {
    public static void main(String[] args) {
        DefalutTableModelNauka frame = new DefalutTableModelNauka();
        String columns[] = {"Manufacturer", "Name", "Year"};
        String data[][] = {
                {"Ford", "Mustang", "1970"},
                {"Dodge", "Charger", "1971"},
                {"Ford", "Torino", "1971"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columns);
        model.removeRow(0); // Usuwa Pierwszy wiersz
        JTable jt = new JTable(model);

        // Dodanie wiersza na początek
        model.insertRow(0, new Object[] {"Ford", "T", "1920"});

        // Dodanie an koniec
        model.insertRow(model.getRowCount(), new Object[]{"Chevrolet", "Camaro", "1970"});

        // Usunięcie pierwszej kolumny
        jt.getColumnModel().removeColumn(jt.getColumnModel().getColumn(0));

        jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jt.setShowHorizontalLines(true);
        jt.setGridColor(Color.blue);
        jt.setCellSelectionEnabled(true); // Pojedyncza komórka
//        jt.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jt.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        ListSelectionModel listSelectionModel = jt.getSelectionModel();
        listSelectionModel.addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if(e.getValueIsAdjusting()) return; // True jeśli zaznaczenie to początek eventu
                        // interesuje nas tylko ostateczna informacja
                        ArrayList<String> arr = new ArrayList<>();
                        int selectedRows[] = jt.getSelectedRows();
                        int selectedColumns[] = jt.getSelectedColumns();

                        String selectedData = null;
                        for(int i = 0; i < selectedRows.length; i++) {
                            for (int j = 0; j < selectedColumns.length; j++) {
                                selectedData = (String) jt.getValueAt(selectedRows[i], selectedColumns[j]);
                                arr.add(selectedData);
                            }
                        }
                        System.out.println("Selected: " + arr);
                    }
                }
        );

        frame.add(jt);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
