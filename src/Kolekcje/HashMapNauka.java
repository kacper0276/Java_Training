package Kolekcje;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Car {
    private String name;
    public Car(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

// Mapa mapuje klucze po wartości
public class HashMapNauka {
    public static void main(String[] args) {
        HashMap<String, Car> map = new HashMap<String, Car>();
        map.put("Dodge", new Car("Viper"));
        map.put("Ford", new Car("F-150"));
        map.put("Pontiac", new Car("Firebird"));

        Car c = map.get("Ford");
        System.out.println(c);

        Iterator i = map.entrySet().iterator();
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            // klucz - wartość
            System.out.println(me.getKey() + " - " + me.getValue());
        }

        for(Map.Entry<String, Car> entry: map.entrySet()) {
            String key = entry.getKey();
            Car car = entry.getValue();
            System.out.println(key + " - " + car);
        }

        // Dostępne metody
        // clear(), clone(), containsKey(), containsValue(), entrySet(), get(), size(),
        // isEmpty(), keySet(), put(), putAll(), values()

    }
}
