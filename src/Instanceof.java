class Animall {
    String type;
    int weight;
}

class Dog extends Animall {
}

class Tiger extends Animall {
}

class Productt {}

class Comp extends Productt {}

public class Instanceof {
    public static void main(String[] args) {
        Animall animal = new Animall();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Productt product = new Productt();
        Comp computer = new Comp();

        // Pozwala sprawdzić czy dany obiekt jest instancją danej klasy
        System.out.println(animal instanceof Animall);
        System.out.println(null instanceof Animall);
        System.out.println(dog instanceof Animall);
        System.out.println(tiger instanceof Animall);
        System.out.println(animal instanceof Dog);
        System.out.println(computer instanceof Productt);
        System.out.println(product instanceof Productt);
        System.out.println(product instanceof Comp);
    }
}
