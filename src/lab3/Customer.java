package lab3;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private final List<OnlineProduct> cart;
    private Order currentOrder;

    public Customer(String name, String email) {
        this.name = name;
        cart = new ArrayList<>();
    }

    public void addToCart(OnlineProduct product) {
        cart.add(product);
    }

    public void checkout() {
        currentOrder = new Order(cart);
        // реализация оплаты заказа
        currentOrder.pay();
    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public String getName() {
        return name;
    }
}
