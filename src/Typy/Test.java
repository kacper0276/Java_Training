package types;

class Vehicle {
    public String name;
    public Vehicle() {}
    public Vehicle(String name) {
        this.name = name;
    }
}

class Plane extends Vehicle {
    public int range;
    public Plane(String name) {
        super(name);
    }
}

class FighterJet extends Plane {
    boolean sonicSpeed;
    public FighterJet(String name) {
        super(name);
    }
}

public class Test {
    public static void main(String args[]) {
        // OK
        Vehicle newVehicle = new Plane("plane");
        Vehicle fighterJet = new FighterJet("fighterJet");

        // nieprawidłowe
        //Plane testPlane = new Vehicle("Vehicle as plane"); // error
        //FighterJet testJet = new Vehicle("Vehicle as FighterJet"); // error
    }
}


