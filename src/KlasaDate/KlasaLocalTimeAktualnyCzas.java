package KlasaDate;

import java.time.LocalTime;

public class KlasaLocalTimeAktualnyCzas {
    public static void main(String[] args) {
        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);
        System.out.println("Godzina: " + localtime.getHour());
        System.out.println("Minuty: " + localtime.getMinute());
        System.out.println("Sekundy: " + localtime.getSecond());

        localtime = localtime.minusMinutes(20);
        localtime = localtime.minusHours(3);

        // Po odjęciu
        System.out.println(localtime);
        System.out.println("Godzina: " + localtime.getHour());
        System.out.println("Minuty: " + localtime.getMinute());
        System.out.println("Sekundy: " + localtime.getSecond());
    }
}
