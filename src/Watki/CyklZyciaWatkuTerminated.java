package Watki;

// TERMINATED - stan gdy wątek zakończył swoją pracę

class NowyWatek extends Thread {
    public NowyWatek(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " started");
        System.out.println(getName() + " finished");
    }
}

public class CyklZyciaWatkuTerminated {
    public static void main(String[] args) throws InterruptedException {
        NowyWatek thread1 = new NowyWatek("Thread1");
        thread1.start();

        // Sleep main thread for second
        Thread.sleep(1000);
        // Terminated
        System.out.println(thread1.getState());
    }
}
