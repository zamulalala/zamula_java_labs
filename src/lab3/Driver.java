package lab3;

class Driver {
    private final String name;
    private boolean available;
    private boolean onDuty;
    private boolean needsRepair;
    private CarForAutobase car;

    public Driver(String name) {
        this.name = name;
        this.available = true;
        this.onDuty = false;
        this.needsRepair = false;
        this.car = null;
    }

    public void setOnDuty(boolean onDuty) {
        this.onDuty = onDuty;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }

    public void assignCar(CarForAutobase car) {
        this.car = car;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isOnDuty() {
        return onDuty;
    }

    public boolean needsRepair() {
        return needsRepair;
    }

    public CarForAutobase getCar() {
        return car;
    }

    public String toString() {
        return "{ name: " + this.name + ", available: " + this.available + ", onDuty: " + this.onDuty + ", needsRepair: " + this.needsRepair + (this.car != null ? ", car: " + this.car : "") + "}";
    }
}
