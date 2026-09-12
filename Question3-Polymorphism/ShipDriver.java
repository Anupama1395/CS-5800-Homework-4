public class ShipDriver {

    private static final Ship[] ships = new Ship[3];

    public static void main(String[] args) {

        ships[0] = new Ship(
                "Santa Maria", "1460");

        ships[1] = new CruiseShip(
                "Ocean Dream", "2018", 3200);

        ships[2] = new CargoShip(
                "Pacific Carrier", "2012", 55000);

        System.out.println("SHIP INFORMATION");
        System.out.println("================");

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}