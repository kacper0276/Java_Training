package Interfejsy;

public class InterfejsUzycie implements Vehicle, InnyInterface{
    public void move() {
        System.out.println("Uzycie move");
    }

    public void getTopSpeed() {
        System.out.println("TopSpeed Uzycie");
    }

    public int getNumWheels() {
        return 4;
    }
}
