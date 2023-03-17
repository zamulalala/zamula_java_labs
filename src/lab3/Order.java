package lab3;

import java.util.List;

public class Order {
    private final List<OnlineProduct> products;
    private double totalPrice;
    private boolean isPaid;

    public Order(List<OnlineProduct> products) {
        this.products = products;
        calculateTotalPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void pay() {
        isPaid = true;
    }

    private void calculateTotalPrice() {
        totalPrice = 0;
        for (OnlineProduct product : products) {
            totalPrice += product.getPrice();
        }
    }
}