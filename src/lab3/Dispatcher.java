package lab3;

import java.util.ArrayList;

public class Dispatcher {

    private final ArrayList<Driver> drivers;
    private final ArrayList<CarForAutobase> cars;
    private String result;

    public Dispatcher() {
        this.drivers = new ArrayList<>();
        this.cars = new ArrayList<>();
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        drivers.remove(driver);
    }

    public void addCar(CarForAutobase car) {
        cars.add(car);
    }

    public void removeCar(CarForAutobase car) {
        cars.remove(car);
    }

    public void assignDriverToCar(Driver driver, CarForAutobase car) {
        if (driver.getCar() != null) {
            driver.getCar().setNeedsRepair(true);
        }
        driver.assignCar(car);
        driver.setAvailable(false);
    }

    public void markTripComplete(Driver driver) {
        driver.setAvailable(true);
        driver.getCar().setNeedsRepair(false);
    }

    public void markDriverForRepair(Driver driver) {
        driver.setNeedsRepair(true);
        driver.setAvailable(false);
    }

    public void suspendDriver(Driver driver) {
        driver.setOnDuty(false);
        driver.setAvailable(false);
        driver.getCar().setNeedsRepair(false);
    }

    public void reinstateDriver(Driver driver) {
        driver.setOnDuty(true);
    }

    public String getDrivers() {
        result = "";
        this.drivers.forEach(driver -> result += driver.toString() + "\n");
        return result;
    }

    public String getCars() {
        result = "";
        this.cars.forEach(car -> result += car.toString() + "\n");
        return result;
    }

}
