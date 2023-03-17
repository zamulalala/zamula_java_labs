package lab3;

import java.util.Date;

public class Sale {
    private final Order order;
    private final Date date;

    public Sale(Order order, Date date) {
        this.order = order;
        this.date = date;
    }

    public double getTotalPrice() {
        return order.getTotalPrice();
    }

    public Date getDate() {
        return date;
    }
}