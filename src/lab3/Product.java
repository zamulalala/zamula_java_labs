package lab3;

public class Product {
    private int id;
    private String name;
    private String upc;
    private String manufacturer;
    private double price;
    private double shelfLife;
    private int quantify;

    public Product(int id, String name, String upc, String manufacturer, double price, double shelfLife, int quantify) {
        this.id = id;
        this.name = name;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.shelfLife = shelfLife;
        this.quantify = quantify;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(double shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getQuantify() {
        return quantify;
    }

    public void setQuantify(int quantify) {
        this.quantify = quantify;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", upc=" + upc +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", shelfLife=" + shelfLife +
                ", quantify=" + quantify +
                '}';
    }

    public boolean isName(String name) {
        return name.equals(this.name);
    }

    public boolean isNameAndPrice(String currentName, double currentPrice) {
        return (currentName.equals(this.name) && (this.price <= currentPrice));
    }

    public boolean isShelfLife(double shelfLife) {
        return this.shelfLife > shelfLife;
    }

}
