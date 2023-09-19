package KlasaDate;
import java.text.SimpleDateFormat;
import java.util.Date;
public class KlasaDateNauka {
    public static void main(String[] args) {
        // Aktualna data
        Date date = new Date();

        // Tue Sep 19 02:41:39 CEST 2023
        System.out.println(date.toString());

        // Liczba milisekund od 1 stycznia 1970r.
        long milisecondsSince1970 = date.getTime();
        System.out.println(milisecondsSince1970);

        // Formatowanie daty
        // y - rok jako liczby np. 2023
        // M - miesiąc w roku np. Jan czy 01
        // d - dzień np. 10
        // h - godzina (1-12) np. 6
        // H - godzina (0-23) np. 15
        // m - minuta np. 45
        // s - sekunda np. 56
        // S - milisekunda np. 456
        // E - dzień tygodznia np. pon.
        // D - dzień roku np. 123
        // w - numer tygodnia w roku np.3
        // W - numer tygodnia w miesiącu np. 2
        // a - A.M. / P.M. np. PM
        // z - time zone np. Eastern Standard Time

        SimpleDateFormat dateFormat = new SimpleDateFormat("E HH:mm:ss dd.MM.YYYY");
        System.out.println(dateFormat.format(date));
    }
}
