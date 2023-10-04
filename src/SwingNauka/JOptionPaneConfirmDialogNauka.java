package SwingNauka;

import javax.swing.*;

public class JOptionPaneConfirmDialogNauka extends JFrame {
    public static void main(String[] args) {
        int result = JOptionPane.showConfirmDialog(
                null, // okno
                "Zapisać dane?", // tekst
                "Dane zmodyfikowane", // tytuł
                JOptionPane.YES_NO_OPTION // Rodzaj opcji
        );

        System.out.println("Result: " + (result == JOptionPane.YES_OPTION));

        int result1 = JOptionPane.showConfirmDialog(
                null, // okno
                "Zapisać dane?", // tekst
                "Dane zmodyfikowane", // tytuł
                JOptionPane.YES_NO_CANCEL_OPTION // Rodzaj opcji
        );

        System.out.println("Result1: " + (result1 == JOptionPane.YES_OPTION)); // YES_OPTION, NO_OPTION, CANCEL_OPTION
    }
}
