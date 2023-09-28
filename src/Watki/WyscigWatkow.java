package Watki;

// np. Gdy dwa wątki odczytują wartość zmiennej counter jako zerą, inkrementują ją do jeden ale przy zapisie drugi wątek jest szybszy
// Wpisz do counter 1 i pobierze 1 do kolejnej iteracji petli for, następnie wpisze 2 do zmiennej counter,
// Nastepnie budzi się wątek pierwszy, który dopiero dostał czas procesora, ale on posiada nadal wartość 1 i zapisze ją w counter,
// nadpisując wartość 3, dzieje się tak ponieważ wątki są nie zsynchronizowane



class CounterThread implements Runnable {
    WyscigWatkow app;
    public CounterThread(WyscigWatkow app) {
        this.app = app;
    }

    @Override
    public void run() {
        for(int i = 0; i < 200000; i++) {
            app.increment();
        }
    }
}

public class WyscigWatkow {
    public int counter = 0;
    public synchronized void increment() { // Synchronized to naprawia - tylko jeden wątek będzie mógł wywołać ten kod
        synchronized (this) { // Blok kodu synchronized
            this.counter++;
        }
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        WyscigWatkow t = new WyscigWatkow();
        Thread thread1 = new Thread(new CounterThread(t));
        Thread thread2 = new Thread(new CounterThread(t));
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(t.getCounter());
    }
}
