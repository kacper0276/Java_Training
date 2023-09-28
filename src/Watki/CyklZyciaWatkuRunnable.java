package Watki;

public class CyklZyciaWatkuRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> {
                    int i = 5;
                    while (i > 0) {
                        System.out.println("Odliczanie: " + i);
                        try {
                            Thread.sleep(1000);
                        } catch(InterruptedException e) {
                            e.printStackTrace();
                        }

                        i--;
                    }
                }
        );

        thread.start(); // wątek w stanie RUNNABLE bo wywołana metoda run()
        System.out.println("  " + thread.getState());
    }
}
