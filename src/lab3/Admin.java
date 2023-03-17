package lab3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Admin {
    private final List<OnlineProduct> products;
    private final List<Sale> sales;
    private final Blacklist blacklist;

    public Admin() {
        products = new ArrayList<>();
        sales = new ArrayList<>();
        blacklist = new Blacklist();
    }

    public void addProduct(OnlineProduct product) {
        products.add(product);
    }

    public void registerSale(Order order) {
        Sale sale = new Sale(order, new Date());
        sales.add(sale);
    }

    public void addCustomerToBlacklist(String customer) {
        blacklist.addCustomer(customer);
    }

    public boolean isCustomerBlacklisted(String customer) {
        return blacklist.isBlacklisted(customer);
    }
}