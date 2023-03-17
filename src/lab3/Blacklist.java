package lab3;


import java.util.ArrayList;
import java.util.List;

public class Blacklist {
    private final List<String> customers;

    public Blacklist() {
        this.customers = new ArrayList<>();
    }

    public Blacklist(List<String> customers) {
        this.customers = customers;
    }

    public void addCustomer(String customer) {
        customers.add(customer);
    }

    public boolean isBlacklisted(String customer) {
        return customers.contains(customer);
    }
}
