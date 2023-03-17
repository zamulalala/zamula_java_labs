package lab3;

public class Lab3_4_9 {
    public static void main(String[] args) {
        Admin admin = new Admin();

        // добаляю товары
        OnlineProduct p1 = new OnlineProduct("iPhone 13", "Smartphone Apple", 999.99);
        OnlineProduct p2 = new OnlineProduct("Samsung Galaxy S21", "Smartphone Samsung", 799.99);
        admin.addProduct(p1);
        admin.addProduct(p2);

        // создаю клиентов
        Customer c1 = new Customer("Rita", "rita@gmail.com");
        Customer c2 = new Customer("Mycar", "mycar@gmail.com");

        // добавляю товары в корзину клиентов
        c1.addToCart(p1);
        c2.addToCart(p2);
        c2.addToCart(p1);

        // оформляю заказы и производим оплату
        c1.checkout();
        c2.checkout();

        // регистрирую продажи
        admin.registerSale(c1.getCurrentOrder());
        admin.registerSale(c2.getCurrentOrder());

        // добавляю неплательщика в черный список
        admin.addCustomerToBlacklist(c1.getName());

        // проверяю, есть ли клиент в черном списке
        System.out.println(admin.isCustomerBlacklisted(c1.getName())); // true
        System.out.println(admin.isCustomerBlacklisted(c2.getName())); // false
    }

}
