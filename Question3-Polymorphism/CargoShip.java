public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        setCargoCapacity(cargoCapacity);
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        if (cargoCapacity < 0) {
            throw new IllegalArgumentException(
                    "Cargo capacity cannot be negative.");
        }
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void print() {
        System.out.println("Cargo ship name: " + getName());
        System.out.printf("Cargo capacity: %,d tons%n", cargoCapacity);
    }
}
