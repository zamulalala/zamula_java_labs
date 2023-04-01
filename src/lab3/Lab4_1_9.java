package lab3;

import java.util.List;

public class Lab4_1_9 {

    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Rollercoaster", "10:00 - 18:00", 499.99);
        park.addAttraction("Ferris Wheel", "11:00 - 20:00", 449.99);
        park.addAttraction("Bumper Cars", "12:00 - 22:00", 599.99);


        List<Park.Attraction> attractions = park.getAttractions();
        for (Park.Attraction attraction : attractions) {
            System.out.println("Attraction: " + attraction.name());
            System.out.println("Working Hours: " + attraction.workingHours());
            System.out.println("Cost: " + attraction.cost());
            System.out.println();
        }
    }

}
