package Watki;

// Java posiada dwa typy wątków. Klienckie np głowny wątek naszej aplikacji czyli Main oraz demoniczne.
// Maszyna wirtualna Javy kończy pracę gdy zakończy swoje działanie ostatni wątek kliencki, wtedy również wszystkie wątki demoniczne konćzą swoją pracę
// nawet jeśli wykonują jeszcze swoje zadanie.
// Ważne jest aby w wątkach demonicznych nie wykonywać np. operacji na plikach
// Typ wątku jest dziedziczony z wątku z jakiego został stworzony, ponieważ main jest wątkiem klienckim to każdy kolejny w aplikacji automatycznie będzie wątkiem klienckim

public class WatkiDemoniczne {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                System.out.println("Wątek demoniczny start");
                while (true) {

                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Działanie: " + i);
                    i++;
                }
            }
        });

        thread.setDaemon(true); // Ustawiamy przed start
        thread.start();
        System.out.println(thread.isDaemon());
        Thread.sleep(10000);
        System.out.println("Quit main thread");
    }
}
