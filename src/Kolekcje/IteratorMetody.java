package Kolekcje;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMetody {
    public static void main(String[] args) {
        // next
        // hasNext
        // remove
        // forEachRemaining

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ford");
        cars.add("Pontiac");
        cars.add("Dodge");

        cars.iterator().forEachRemaining(el -> System.out.println("Car: " + el));

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            String el = iterator.next();
            if(el.equalsIgnoreCase("Pontiac")) {
                iterator.remove();
            }
        }

        System.out.println(cars);
    }
}
