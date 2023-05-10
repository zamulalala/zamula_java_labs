package lab5;

import lab3.Car;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Lab5_2_8 {
    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car(1, "Ford", "Galaxy", 2010, "Blue", 1.6, "A123BC77"),
                new Car(2, "Renault", "Logan", 2010, "Red", 0.3, "E456HK77"),
                new Car(3, "Toyota", "Camry", 2008, "Black", 1.2, "M007AB77"),
                new Car(4, "Ford", "Focus", 2015, "Grey", 1.3, "C223OT77"),
                new Car(5, "Ford", "Explorer", 2021, "Black", 3.5, "A777AA77"),
                new Car(6, "Toyota", "Camry", 2010, "White", 1.7, "P482CX77"),
                new Car(7, "Toyota", "Camry", 2010, "Green", 1.9, "K911EC77"),
        };

        List<Car> fords;
        try {
            fords = listMarks(cars, "Ford");
            System.out.println("Автомобили марки Ford: ");
            for (Car ford : fords) {
                System.out.println(ford);
            }
            System.out.println("******************************************************************");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        List<Car> camry2010;
        try {
            camry2010 = listModelAndYear(cars, "Camry", 13);
            System.out.println("Автомобили модели Camry, младше 13 лет: ");
            for (Car car : camry2010) {
                System.out.println(car);
            }
            System.out.println("******************************************************************");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        List<Car> expensiveCars;
        try {
            expensiveCars = listYearAndPrice(cars, 2010, 1.5);
            System.out.println("Автомобили 2010 года, дороже 1.5 млн: ");
            for (Car car : expensiveCars) {
                System.out.println(car);
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


    public static List<Car> listMarks(Car[] cars, String mark){
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.isMark(mark)) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> listModelAndYear(Car[] cars, String model, int nYear){
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.isModelAndNYear(model, nYear)) {
                result.add(car);
            }
        }
        return result;
    }

    public static List<Car> listYearAndPrice(Car[] cars, int year, double price){
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.isYearAndPrice(year, price)) {
                result.add(car);
            }
        }
        return result;
    }
}
