package OperacjeNaPlikach;

// Przy zapisie lub odczytaniu obiektów warto skorzystać z serializacji co ułatwi archwizacje danych
// Do serializacji stosuję się klasy:
// - ObjectOutputStream wraz z metodą writeObject(Object o) zapisującą do strumienia
// - ObjectInputStream wraz z metodą Object readObject() zwracającą referencję do obiektu odczytanego ze strumienia

// Serializowane mogą być tylko obiekty implementujące interfejs Serializable (Większość obiektów w Java implementuje ten interfejs)
// Specjalny specyfikator transient określa, że dane pole nie będzie serializowane

import java.io.*;

class CarTest implements Serializable {
    public String manufacturer;
    public String name;
    public transient int id;
    public int topSpeed;

    public CarTest(String manufacturer, String name, int id, int topSpeed) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.id = id;
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Id: " + id;
    }
}

public class Serializacja {
    public transient int data = 95; // Pole nie będzie zapisywane
    public static void main(String[] args) throws Exception {
        CarTest car1 = new CarTest("Ford", "T", 1, 30);
        CarTest car2 = new CarTest("Dodge", "Charger", 2, 220);
        CarTest car3 = new CarTest("Opel", "Omega", 3, 200);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("files\\cars.ser"));

        out.writeObject(car1);
        out.writeObject(car2);
        out.writeObject(car3);
        out.flush(); // Opróżnia buffor
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("files\\cars.ser"));
        CarTest carTest1 = (CarTest) in.readObject();
        CarTest carTest2 = (CarTest) in.readObject();
        CarTest carTest3 = (CarTest) in.readObject();

        System.out.println(carTest1);
        System.out.println(carTest2);
        System.out.println(carTest3);
    }
}
