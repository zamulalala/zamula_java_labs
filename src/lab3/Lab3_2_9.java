package lab3;

import java.util.ArrayList;
import java.util.List;

public class Lab3_2_9 {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product(1, "lipstick", "12345600005", "MAC", 1.7, 1.5, 148),
                new Product(2, "mascara", "21735600006", "INGLOT", 2.2, 1.0, 11),
                new Product(3, "blush", "086320600007", "MAC", 1.9, 3.3, 221),
                new Product(4, "cream", "002638600003", "PAYOT", 6.0, 1.4, 93),
                new Product(5, "shadow", "015338600009", "MAC", 4.5, 2.5, 160),
                new Product(6, "lipstick", "008437200003", "SCINIC", 0.7, 1.5, 20),
                new Product(7, "lipstick", "076649900004", "MAC", 1.4, 2.0, 45),
        };

        List<Product> lipsticks = listName(products, "lipstick");
        System.out.println("Lipsticks: ");
        for (Product lipstick : lipsticks) {
            System.out.println(lipstick);
        }
        System.out.println("******************************************************************");

        List<Product> cheapLipsticks = listNameAndPrice(products, "lipstick", 1.5);
        System.out.println("Lipsticks cheaper 1.5: ");
        for (Product product : cheapLipsticks) {
            System.out.println(product);
        }
        System.out.println("******************************************************************");

        List<Product> shelfLifeProducts = listShelfLife(products, 1.6);
        System.out.println("Products with a shelf life of more than 1.6 years: ");
        for (Product product : shelfLifeProducts) {
            System.out.println(product);
        }

    }

    public static List<Product> listName(Product[] products, String name){
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.isName(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public static List<Product> listNameAndPrice(Product[] products, String name, double price){
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.isNameAndPrice(name, price)) {
                result.add(product);
            }
        }
        return result;
    }

    public static List<Product> listShelfLife(Product[] products, double shelfLife){
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.isShelfLife(shelfLife)) {
                result.add(product);
            }
        }
        return result;
    }


}
