package SwingNauka;

import javax.swing.*;

public class JOptionPaneNaukaInput extends JFrame {
    public static void main(String[] args) {
        String result = (String) JOptionPane.showInputDialog(null, "Wpisz swoje imię: ");

        System.out.println("Twoje imię to: " + result);

        String countries[] = {"Poland", "UK", "Spain", "Germany", "USA"};
        String resultSelect = (String) JOptionPane.showInputDialog(
                null, // okno rodzic
                null, // komunikat
                "Wybierz kraj", // Tytuł
                JOptionPane.WARNING_MESSAGE, // typ komunikatu (QUESTION_MESSAGE)
                null, // ikona
                countries, // opcje do wyboru
                countries[0] // wartość początkowa
        );

        System.out.println("Wybrany kraj to: " + resultSelect);
    }
}
