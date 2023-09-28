package Watki;

class NewThread extends Thread {
    public NewThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " started");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " finished");
    }

}
// TIMED_WAITING - gdy uśpiony wątek oczekuje określony czas na swoją dalszą pracę
// np. po wywołaniu metody sleep(time). W przykładzie thread1 czeka 5 sekund po wywołaniu sleep i ma state TIMED_WAITING
public class CyklZyciaWatkuTimedWaiting {
    public static void main(String[] args) throws InterruptedException {
        NewThread thread1 = new NewThread("Thread1");
        thread1.start();

        // Sleep main thread for second
        Thread.sleep(1000);
        // TIMED_WAITING
        System.out.println(thread1.getState());
    }
}
