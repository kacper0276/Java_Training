package KlasyWewnetrzne;

class Car {
    private String modelName;
    private String manufacturer;

    public static class CarBuilder {
        private Car car = new Car();
        public CarBuilder setModelName(String modelName) {
            car.modelName = modelName;
            return this;
        }
        public CarBuilder setManufacturer(String manufacturer) {
            car.manufacturer = manufacturer;
            return this;
        }
        public Car getCar() {
            return car;
        }
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

public class PubliczneKlasyWewnetrzne {
    public static void main(String[] args) {
        Car someCar = new Car.CarBuilder().setModelName("Charger").setManufacturer("Ford").getCar();

        System.out.println(someCar.getManufacturer());
        System.out.println(someCar.getModelName());
    }
}
