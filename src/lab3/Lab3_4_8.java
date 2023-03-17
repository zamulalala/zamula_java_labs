package lab3;

public class Lab3_4_8 {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        Driver d1 = new Driver("Rita");
        Driver d2 = new Driver("MyCar");
        Driver d3 = new Driver("Nargiz");

        dispatcher.addDriver(d1);
        dispatcher.addDriver(d2);
        dispatcher.addDriver(d3);

        CarForAutobase c1 = new CarForAutobase("Ford", "Galaxy", 2008);
        CarForAutobase c2 = new CarForAutobase("Renaut", "Logan", 2012);
        CarForAutobase c3 = new CarForAutobase("Audi", "TT", 2015);

        dispatcher.addCar(c1);
        dispatcher.addCar(c2);
        dispatcher.addCar(c3);

        //назначить водителя1 на автомобиль1
        dispatcher.assignDriverToCar(d1, c1);

        //пометить поездку водителя1 как завершенную
        dispatcher.markTripComplete(d1);

        //поставить машину водителя1 на ремонт
        dispatcher.markDriverForRepair(d1);

        //отстранить водителя1
        dispatcher.suspendDriver(d1);

        dispatcher.assignDriverToCar(d2, c2);

        dispatcher.markTripComplete(d2);

        dispatcher.suspendDriver(d2);

        dispatcher.reinstateDriver(d2);

        System.out.println(dispatcher.getDrivers());
        System.out.println(dispatcher.getCars());
    }
}
