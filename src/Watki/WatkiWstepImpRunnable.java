package Watki;

public class WatkiWstepImpRunnable implements Runnable{
    private int sleepTime;

    public WatkiWstepImpRunnable(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    public void run() {
        int i = 5;
        while (i > 0) {
            System.out.println("Odliczanie: " + i);
            try {
                Thread.sleep(sleepTime);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }

            i--;
        }
    }

    public static void main(String[] args) {
        WatkiWstepImpRunnable prog = new WatkiWstepImpRunnable(1000);
        Thread thread = new Thread(prog);
        thread.start();

        WatkiWstepImpRunnable prog1 = new WatkiWstepImpRunnable(200);
        Thread thread2 = new Thread(prog1);
        thread2.start();
    }
}
