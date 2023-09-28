package Watki;

import java.util.LinkedList;

class MyHouse {
    private LinkedList<String> delivery = new LinkedList<>();
    public void waitForDelivery() {
        synchronized (delivery) {
            while (delivery.isEmpty()) {
                try {
                    System.out.println("Waiting for delivery");
                    delivery.wait();
                } catch (InterruptedException e) {}
            }
        }
        System.out.println("Delivery recieved: " + delivery.poll());
    }

    public void pizzaGuy() {
        synchronized (delivery) {
            System.out.println("Pizza delivery ");
            this.delivery.add("Pizza");
            delivery.notify();
        }
    }
}

// Pętla while jest konieczna, bo wątek może być wybudzony nawet jeśli dane nie są gotowem czyli gdy nie było wywołania notify, dlatego sprawdza się czy listanie jest pusta
// Do synchronizacji jest użyty delivery dzięki czemu mamy pewność że nie nastąpi wyścig przy dodawaniu i zdejmowaniu elementów
// Każdy obiekt powiązany jest z monitorem i ma też zbiór powiadamianych wątków, które czekają na jego powiadomienie (delivery.wait())
// notify() wysyła powiadomeinie i wybudza czekajacy wątek
public class MetodaWaitINotify {
    public static void main(String[] args) throws InterruptedException {
        MyHouse myHouse = new MyHouse();
        Thread customer = new Thread(new Runnable() {
            @Override
            public void run() {
                myHouse.waitForDelivery();
            }
        });
        customer.start();
        Thread.sleep(3000);
        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                myHouse.pizzaGuy();
            }
        });

        producer.start();
        customer.join(); // Main thread wait for customer
    }
}
