package Watki;

class SomeThread implements Runnable {
    public static synchronized void test() { // Synchronized - oznacza że tylko jeden wątek może ją wywoływać
        while (true) {
            // infitnite loop, simulate
            // first thread long work
            // thread2 will not be able to enter it
        }
    }

    @Override
    public void run() {
        test(); // Dwa wątki dostęp do tej samej metody
    }
}
public class CyklZyciaWatkuBlocked {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new SomeThread());
        Thread thread2 = new Thread(new SomeThread());
        thread1.start();
        thread2.start(); // Blokowane przez thread1
        Thread.sleep(100); // Usypia główny wątek
        System.out.println(thread1.getState());
        System.out.println(thread2.getState());
    }
}
