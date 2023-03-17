package lab3;

public class CarForAutobase {
    private final String mark;
    private final String model;
    private final int year;
    private boolean needsRepair;

    public CarForAutobase(String mark, String model, int year) {
        this.mark = mark;
        this.model = model;
        this.year = year;
        this.needsRepair = false;
    }

    public void setNeedsRepair(boolean needsRepair) {
        this.needsRepair = needsRepair;
    }

    public boolean needsRepair() {
        return needsRepair;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "{ mark: " + this.mark + ", model: " + this.model + ", year: " + this.year + ", needsRepair: " + this.needsRepair;
    }

}
