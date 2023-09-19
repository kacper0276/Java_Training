package KlasaDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class KlasaLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDate = localDateTime.format(myFormatObj);
        System.out.println("With formatting: " + formattedDate);

        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
    }
}
