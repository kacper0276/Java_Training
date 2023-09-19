package KlasaDate;

import java.util.Date;

public class MierzenieCzasuWykonywaniaProgramu {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try {
            for(int a = 0; a < 5; a++) {

                // Aktualny wątek poczeka 10 milisekund
                Thread.sleep(10);
                // timestamp
                System.out.println(new Date().getTime());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        long elapsedTime = end - start;
        System.out.println("Code took milliseconds " + elapsedTime);
    }
}
