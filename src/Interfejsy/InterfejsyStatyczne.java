package Interfejsy;

// Możemy rozszerzać interfejsy
// public interface InterfejsyStatyczne extends Animal, Eating, Flying
public interface InterfejsyStatyczne  {
    // Nieważne co dodamy i tak będzie statyczną stała
    static final float DEFAULT_VALUE = 0.7f;

    // Statyczne metody nie potrzebują default
    // Domyślne implementacje dodajemy default
    default float getWingsspan() {
        return InterfejsyStatyczne.DEFAULT_VALUE;
    }
}
