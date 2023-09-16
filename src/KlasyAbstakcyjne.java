// Nie pozwala na utworzenie instancji klasy abstrakcyjnej
// może posiadać abstakcyjne metody, bez implementacji które muszą być uzupełnione w podklasie
public abstract class KlasyAbstakcyjne {
    private String modelName;
    public KlasyAbstakcyjne(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Podklasa musi zaimplementować abstrakcyjne metody
    public abstract void printInfo();

}
