package KlasaDate;

import java.time.LocalDate;

public class KlasaLocalDate {
    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate);
        System.out.println(localdate.getDayOfMonth());
        System.out.println(localdate.getDayOfWeek());
        System.out.println(localdate.getDayOfYear());
        System.out.println(localdate.getMonth());
        System.out.println(localdate.getYear());
        System.out.println(localdate.getMonthValue());

        localdate = localdate.minusMonths(5);
        System.out.println(localdate.getMonthValue());
        localdate = localdate.plusYears(10);
        System.out.println(localdate.getYear());
    }
}
