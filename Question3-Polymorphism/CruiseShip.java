public class CruiseShip extends Ship {
    private int maximumPassengers;

    public CruiseShip(String name, String yearBuilt, int maximumPassengers) {
        super(name, yearBuilt);
        setMaximumPassengers(maximumPassengers);
    }

    public int getMaximumPassengers() {
        return maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers) {
        if (maximumPassengers < 0) {
            throw new IllegalArgumentException(
                    "Maximum passengers cannot be negative.");
        }
        this.maximumPassengers = maximumPassengers;
    }

    @Override
    public void print() {
        System.out.println("Cruise ship name: " + getName());
        System.out.printf("Maximum passengers: %,d%n", maximumPassengers);
    }
}
