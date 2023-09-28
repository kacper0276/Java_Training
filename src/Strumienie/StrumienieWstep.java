package Strumienie;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Car {
    public String name;
    public int topSpeed;
    public int price;
    public int seatsNumber;

    public Car(String name, int topSpeed, int price, int seatsNumber) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.price = price;
        this.seatsNumber = seatsNumber;
    }

    public String toString() {
        return  "Name: " + name + " TopSpeed: " + topSpeed + " Price: " + price + " SeatsNumber: " + seatsNumber;
    }

    public int getPrice() {
        return price;
    }
}

// Strumienie pozwalają na łatwą iterację oraz manipulowanie elementami np. Kolekcji.
// Stram to interfejs generyczny mający typ danych z strumienia
// Zawiera metody takie jak forEach, map, filter etc;
public class StrumienieWstep {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ania");
        arr.add("Kasia");
        arr.add("Kacper");
        arr.add("Daniel");
        arr.add("Michał");
        arr.add("Kacper");
        arr.add("Ania");

        List<Integer> arrInt = Arrays.asList(5, 3, 6, 9, 10, 1, 45, 32, 7);

        long num = arr.stream().filter(el -> el.length() > 4).count();

        System.out.println(num);

        arr.stream().forEach(el -> System.out.println(el));

        ArrayList<Car> arr1 = new ArrayList<>();
        arr1.add(new Car("Dodge", 240, 240000, 4));
        arr1.add(new Car("Ford", 220, 200000, 4));
        arr1.add(new Car("Citroen", 160, 70000, 3));
        arr1.add(new Car("Bmw", 240, 250000, 4));
        arr1.add(new Car("GMC", 170, 150000, 3));
        arr1.add(new Car("Porsche", 280, 700000, 5));

        // Metoda Collect
        List<Car> list = arr1.stream()
                .filter(e -> e.topSpeed < 270)
                .filter(e -> e.seatsNumber > 2)
                .filter(e -> e.price < 300000)
                .filter(e -> e.name.startsWith("C"))
                .collect(Collectors.toList());
        ArrayList<Car> arrList = new ArrayList<>(list);
        arrList.forEach(c -> System.out.println(c.name));

        // Metoda toSet - set to tylko unikalne wartości
        Set<String> uniqueName = arr.stream()
                .filter(e -> e.startsWith("K") || e.startsWith("A"))
                .collect(Collectors.toSet());
        System.out.println(uniqueName);

        // Metoda summingToInt() - zsumowanie wartości
        int totalPrice = arr1.stream()
                .collect(Collectors.summingInt(el -> el.price));
        System.out.println(totalPrice);

        // Metoda toMap()
        Map<String, Car> mapCar = arr1.stream()
                .collect(Collectors.toMap(car -> car.name, car->car));
        System.out.println(mapCar);
        Car car1 = mapCar.get("Citroen");
        System.out.println(car1);

        // Metoda map() - pobranie danych przez przekazanie referencji do metody
        List<Integer> prices = arr1.stream().filter(car -> car.topSpeed > 200)
                .map(Car::getPrice).collect(Collectors.toList());
        System.out.println(prices);

        // Metoda min() oraz max()
        Car carMaxPrice = arr1.stream().max(
                (car11, car2) -> car11.price > car2.price ? 1 : -1
        ).get();
        Car carMinPrice = arr1.stream().min(
                (car11, car2) -> car11.price > car2.price ? 1 : -1
        ).get();
        System.out.println(carMaxPrice);
        System.out.println(carMinPrice);

        // Metoda limit() - ogranicza liczbę wyników
        List<String> result = arr.stream()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println(result);

        // Metoda count() - zlicza ilość wyników
        long coutnFunction = arr.stream().count();
        System.out.println(coutnFunction);

        // Metoda reduce() - zredukuje zbiór do jednej wartości
        int resultReduce = arrInt.stream().reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(resultReduce);
        int resultSum = arrInt.stream().reduce(0, Integer::sum);
        System.out.println(resultSum);

        // Metoda iterate() - do tworzenia streamów z wartościami
        // start value, next value
        Stream.iterate(0, n -> n + 1)
                .limit(4)
                .forEach(n -> System.out.println(n));

        // start value, condition, next value
        Stream.iterate(0, n -> n < 8, n -> n + 2)
                .forEach(n -> System.out.println(n));




        Stream<Car> elements = arr1.stream()
                .filter(e -> e.topSpeed < 270)
                .filter(e -> e.seatsNumber > 2)
                .filter(e -> e.price < 300000)
                .filter(e -> e.name.startsWith("C"));

        elements.forEach(c -> System.out.println(c.name));
    }
}
