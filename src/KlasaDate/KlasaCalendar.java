package KlasaDate;
import java.util.Calendar;
import java.util.Date;
public class KlasaCalendar {
    public static void main(String[] args) {
        Date dateNow = new Date();
        System.out.println(dateNow);

        // Convert date to calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);

        // Dodanie po jednym dniu, miesiącu, roku, etc
        calendar.add(Calendar.SECOND, 1);
        calendar.add(Calendar.MINUTE, 1);
        calendar.add(Calendar.HOUR, 1);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.YEAR, 1);

        Date newDate = calendar.getTime();
        System.out.println(newDate); // Sun Oct 20 22:44:21 CEST 2024
    }
}
