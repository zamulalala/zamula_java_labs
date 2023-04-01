package Lab4;

public class Lab4_2_8 {
    public static void main(String[] args) {
        CargoShip cargoShip = new Tanker("Tanker01", 10000, 5000);
        cargoShip.move();
        cargoShip.stop();
        System.out.println("Cargo capacity: " + cargoShip.getCargoCapacity());
        cargoShip.loadCargo();
        System.out.println("Oil capacity: " + ((Tanker) cargoShip).getOilCapacity());
    }
}

interface Ship {
    void move();

    void stop();
}

abstract class CargoShip implements Ship {
    private final String name;
    private final int cargoCapacity;

    public CargoShip(String name, int cargoCapacity) {
        this.name = name;
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void loadCargo() {
        System.out.println("Loading cargo...");
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    public void stop() {
        System.out.println(name + " has stopped.");
    }
}

class Tanker extends CargoShip {
    private final int oilCapacity;

    public Tanker(String name, int cargoCapacity, int oilCapacity) {
        super(name, cargoCapacity);
        this.oilCapacity = oilCapacity;
    }

    public int getOilCapacity() {
        return oilCapacity;
    }
}