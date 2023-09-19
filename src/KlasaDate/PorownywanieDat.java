package KlasaDate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PorownywanieDat {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, 5, 3);
        LocalDate date2 = LocalDate.of(2020, 11, 4);

        LocalDateTime date3 = LocalDateTime.of(2023, 9, 19, 22, 29, 00);

        // Czy data jest za inną datą
        if(date2.isAfter(date1)) {
            System.out.println("True ");
        }

        // Czy date2 jest wcześniej niż data1
        if(date2.isBefore(date1)) {
            System.out.println("Date2 is before than date1");
        }

        // Czy daty są takie same
        if(date2.isEqual(date1)) {
            System.out.println("Daty są takie same");
        }
    }
}
