package lab4;

public class Lab4_2_9 {
    public static void main(String[] args) {
        Bookcase bookcase = new Bookcase(5, true);
        System.out.println("Number of shelves: " + bookcase.getNumberOfShelves());
        System.out.println("Has glass doors: " + bookcase.getHasGlassDoors());
        bookcase.move();
        bookcase.openDoor();
        bookcase.closeDoor();
    }
}


interface Furniture {
    void move();
}
abstract class Cabinet implements Furniture {
    private int numberOfShelves;

    public Cabinet(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public void openDoor() {
        System.out.println("Opening the cabinet door.");
    }

    public void closeDoor() {
        System.out.println("Closing the cabinet door.");
    }
}

class Bookcase extends Cabinet {
    private boolean hasGlassDoors;

    public Bookcase(int numberOfShelves, boolean hasGlassDoors) {
        super(numberOfShelves);
        this.hasGlassDoors = hasGlassDoors;
    }

    public boolean getHasGlassDoors() {
        return hasGlassDoors;
    }

    public void setHasGlassDoors(boolean hasGlassDoors) {
        this.hasGlassDoors = hasGlassDoors;
    }

    @Override
    public void move() {
        System.out.println("Moving the bookcase.");
    }

    @Override
    public void openDoor() {
        if (hasGlassDoors) {
            System.out.println("Opening the glass doors of the bookcase.");
        } else {
            System.out.println("Opening the wooden doors of the bookcase.");
        }
    }

    @Override
    public void closeDoor() {
        if (hasGlassDoors) {
            System.out.println("Closing the glass doors of the bookcase.");
        } else {
            System.out.println("Closing the wooden doors of the bookcase.");
        }
    }
}