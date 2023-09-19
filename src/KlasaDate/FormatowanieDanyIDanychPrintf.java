package KlasaDate;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FormatowanieDanyIDanychPrintf {
    // Zasady formatowania tekstu robi się znakiem %
    // %s - podstawia string
    // %d - liczby całkowite
    // %f - liczby rzeczywiste
    // %b - boolean
    // %t - formatuje datę
    // %n - znak nowej linii

    // Formatowanie danych

    // c - pełna data z czasem
    // F - data według formatu ISO 2020-03-03
    // D format US 03/12/2020
    // T - godzina format 24h
    // r - godzina format 12h
    // R - godzina 24h bez sekund
    // Y - rok 2019
    // y - rok 19
    // B - pełny miesiąć grudzień
    // b - skrócony miesiąc gru
    // m - miesiąc 2 cyfry
    // d- dzień 2 cyfry
    // e - dzień bez zer 3
    // A - nazwa dnia np. wtorek
    // a - skrócony dzień tygodnia pon
    // H - godzina 2 cyfy 24h
    // k - godzina bez zer 24h
    // M - minuty 2 cyfry
    // S - sekundy 2 cyfry
    // P - pm/am
    // s - timestamp od 01.01.1970
    // Q - milisekundy od 01.01.1970
    public static void main(String[] args) {
        System.out.printf("Hello %s %n", "World"); // "Hello World \n"

        System.out.printf("%d %f %b", 99, 12.5d, false); // "99 12,500000 false"

        // Data podstawiana dzieki %t ale trzeba określić
        // jaka część daty ma być podstawiona np. c to cała data i czas
        System.out.printf("%n %tc", new Date()); // wt. wrz 19 16:17:10 CEST 2023

        Date date = new Date();
        // Podawanie wielokrotnie argumentu date dla każdego %t
        // jest stratą czasu jeżeli będzie to rozbudowany łańcuch
        System.out.printf("%n %tb %tA", date, date); // wrz wtorek

        // Lepiej odwoływać się do tego samego argumentu
        // %1$tb jest odwołaniem do pierwszego argumentu date jako miesiąc
        // %1$tA jest również odwołaniem do pierwszego date jako nazwa dnia
        System.out.printf("%n %1$tb %1$tA", date); // wrz wtorek

        // t - bo formatujemy datę
        System.out.printf("%n %1$tY.%1$tm.%1$td", date);

        // Jako zmienna a nie wyświetlana w terminalu od razu
        String str = String.format("%n %1$tY.%1$tm.%1$td", date);
        System.out.println(str);

        Date data = new Date();
        long timeStamp = data.getTime();
        System.out.println(timeStamp);

        long oneHouer = 60 * 1000 * 60;
        timeStamp += oneHouer * 24 * 3; // + 3 dni
        timeStamp += oneHouer * 10; // + 10h
        timeStamp += 1000 * 60 * 25; // + 25 min

        Date futureDate = new Date(timeStamp);
        System.out.println(futureDate);
    }
}
