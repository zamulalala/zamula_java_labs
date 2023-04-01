package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private final List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String workingHours, double cost) {
        Attraction attraction = new Attraction(name, workingHours, cost);
        attractions.add(attraction);
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }


    public record Attraction(String name, String workingHours, double cost) {
    }
}

