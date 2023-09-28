package Watki;

// Domyślnie program wykonuje się linijka po linicje
// Dzięki wątkom może podzielić swoją prace na kilka wątków, które będą działały równolegle
// Przez co jego wydajność się zwiększy
// Wątekto wydzielony kawałek aplikacji, który działa niezależnie od głównego wątku programu
public class WatkiWstep extends Thread {
    public WatkiWstep(String name) {
        super(name);
    }

    public void run() {
        int i = 5;
        while (i > 0) {
            System.out.println("Odliczanie: " + i + " Nazwa: " + this.getName());
            try {
                this.sleep(1000);
            } catch(InterruptedException e) {
               e.printStackTrace();
            }

            i--;
        }
    }

    public static void main(String[] args) {
        // Klasa WatkiWstep rozszerza klasę Thread
        // Program musi przesłonić metodę run() której praca rozpoczyna się po rozpoczęciu wątku (metoda start())
        WatkiWstep prog = new WatkiWstep("Wątek 1");
        prog.start();

        WatkiWstep thread2 = new WatkiWstep("Wątek 2");
        thread2.start();
    }
}
