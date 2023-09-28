package Watki;

class TestThread extends Thread {
    Thread mainThread;

    public TestThread(String name, Thread mainThread) {
        super(name);
        this.mainThread = mainThread;
    }

    public void run() {
        System.out.println(getName() + " started");
        for(int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
//                System.out.println("Main thread state: " + mainThread.getState());
            } catch (Exception e) {}
        }
        System.out.println(getName() + " finished");
    }
}
// Waiting gdy wątek czeka aż inny wątek wykona swoja pracę
// Sytuacja ta powstaje z wykorzystaniem metody object.wait() lub thread.join()
public class CyklZyciaWatkuWaiting {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = new Thread();
        TestThread t1 = new TestThread("Thread1", mainThread);
        TestThread t2 = new TestThread("Thread2", mainThread);
        TestThread t3 = new TestThread("Thread3", mainThread);
        t1.start(); t2.start(); t3.start();
        System.out.println("Main wait for t1 to finish");
        t1.join();
        System.out.println("Main wait for t2 to finish");
        t2.join();
        System.out.println("Main wait for t3 to finish");
        t3.join();
        System.out.println("All threads finished");
    }
}
