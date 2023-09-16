public class KlasaAbstrakcyjnaUzycie extends KlasyAbstakcyjne {
    public KlasaAbstrakcyjnaUzycie(String modelName) {
        super(modelName);
    }

    // Konieczna implementacja metody
    public void printInfo() {
        System.out.println("Model " + getModelName());
    }
}
