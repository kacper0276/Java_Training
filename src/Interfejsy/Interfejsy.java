package Interfejsy;

// Interfejs opisuje metodu które klasa musi zaimplementować, to kolekcje abstrakcyjnych metod (może implementować po kilku inrerfejsach, a klasa rozszerza 1 klase)
// Mogą rozszerzać inne interfejsy


public class Interfejsy {
    public static void main(String[] args) {
        InterfejsUzycie inuzycie = new InterfejsUzycie();
        inuzycie.move();
        inuzycie.getTopSpeed();
        System.out.println(inuzycie.getNumWheels());

        // Nie można utworzuć instancji interfejsu
        // Ale można przypisać instancję klasy implementującej interfejs

        Vehicle vehicle = inuzycie;
        vehicle.getTopSpeed();
        vehicle.move();

        InnyInterface d = inuzycie;
        System.out.println(d.getNumWheels());

        // Statyczne stałe
        InterfejsyStatyczneUzycie instatic = new InterfejsyStatyczneUzycie();
        instatic.getWingsspan();
    }
}
