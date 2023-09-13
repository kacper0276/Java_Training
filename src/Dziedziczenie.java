class Vehicle {
    public String type;
    public int numWheels;
    public float topSpeed;
}

class Bicycle extends Vehicle {
    public void printInfo() {
        System.out.println("Type: " + this.type + " Top Speed: " + this.topSpeed);
    }
}

class Car extends Vehicle {
    Car() {
        // super(); <- odwołanie do klasy nadrzędnej (Vehicle), dodawane automatycznie jak nic nie dodamy w konstruktorze
        // super.type <- odwołanie względem klasy Vehicle
        type = "car";
        topSpeed = 200.0f;
    }

    Car(String manufacturer, float topSpeed) {
        // this(); Wywołanie konstruktora bezargumentowego
        this.type = manufacturer;
        this.topSpeed = topSpeed;
    }

    public void printInfo() {
        System.out.println("Type: " + this.type + " Top Speed: " + this.topSpeed);
    }
}

// Final class uniemożliwa dziedziczenie
final class Animal {
    String type;
    int weight;
}

// Błąd kompilatora
//class Dog extends Animal {
//
//}
// Tylko jedna publiczna klasa na plik

class Product {
    private int price;
}

class Computer {
    private int ramSize;
}

// Nie ma wielokrotnego dziedziczenia
//class Laptop extends Product, Computer {
//
//}

public class Dziedziczenie {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.type = "Bicycle";
        bicycle.topSpeed = 15.0f;
        bicycle.printInfo();
        Car car = new Car();
        car.printInfo();
    }
}
