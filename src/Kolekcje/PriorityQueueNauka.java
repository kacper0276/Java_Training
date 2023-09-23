package Kolekcje;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparatorRosnaco implements Comparator<Integer> {
    public int compare(Integer x, Integer y) {
        if(x == y) {
            return 0;
        } else if(x > y) { // rosnąco
            return 1;
        } else {
            return -1;
        }
    }
}

class MyComparatorMalejaco implements Comparator<Integer> {
    public int compare(Integer x, Integer y) {
        if(x == y) {
            return 0;
        } else if(x < y) { // malejaco
            return 1;
        } else {
            return -1;
        }
    }
}

// Sortowanie po długości łańcucha
class StringLengthComparator implements Comparator<String> {
    public int compare(String x, String y) {
        // gdy x > y return 1
        // gdy x < y return -1
        // gdy x == y return 0
        return x.length() - y.length();
    }
}

class Task implements Comparable<Task> {
    private int orderId;
    private String name;

    public Task(int orderId, String name) {
        this.orderId = orderId;
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + " OrderId: " + orderId;
    }

    public int compareTo(Task o) {
        int a = this.orderId;
        int b = o.orderId;

        if(a == b) {
            return 0;
        } else if(a > b) {
            return 1;
        } else {
            return -1;
        }
    }
}
public class PriorityQueueNauka {
    public static void main(String[] args) {
        // Pozwala na stworzenie kolejki ze względu na priorytet, a nie ze względu na to kiedy zostały dodane dane do kolejki
        // Dzięki temu pierwsze mogą być konsumowane dane np. z wyższym priorytetem
        PriorityQueue<Integer> test = new PriorityQueue<>(new MyComparatorMalejaco());
        test.add(12);
        test.add(97);
        test.add(45);
        test.add(5);

        // Domyślnie sortowane rosnąco
        System.out.println(test);

        PriorityQueue<String> test1 = new PriorityQueue<>(new StringLengthComparator());
        test1.add("Zuza");
        test1.add("Ola");
        test1.add("Adam");
        test1.add("Kasia");

        // metoda peek nie ściąga z kolejki
        String item = test1.peek();
        System.out.println(item);

        System.out.println("Sortowanie" + test1);

        // Domyślnie sortowane rosnąco
        while (!test1.isEmpty()) {
            // metoda poll(), pobiera element z kolejki i go wyświetla, ale jednocześnie kasuje element z kolejki
            System.out.println(test1.poll());
        }

        System.out.println(test1);

        PriorityQueue<Task> test2 = new PriorityQueue<>();
        test2.add(new Task(3, "3"));
        test2.add(new Task(1, "1"));
        test2.add(new Task(3, "3"));
        test2.add(new Task(4, "4"));
        test2.add(new Task(2, "2"));

        while (!test2.isEmpty()) {
            System.out.println(test2.poll());
        }
    }
}
