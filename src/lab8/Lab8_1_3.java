package lab8;

import java.util.Random;

public class Lab8_1_3 {

    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);

        new Thread(producer).start();
        new Thread(consumer).start();
    }

}

class Store {
    private int products = 0; // количество товаров на складе
    private final int maxProducts = 10; // максимальное количество товаров на складе
    private final int minProducts = 1; // минимальное количество товаров, которое может купить покупатель

    public synchronized void get() {
        while (products < minProducts) { // пока на складе меньше минимального количества товаров, покупатель ждет
            try {
                System.out.println("Покупатель ждет товара на складе");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Random random = new Random();
        int newProducts = random.nextInt(maxProducts - minProducts + 1) + minProducts; // генерация случайного числа товаров для покупки
        while (products < newProducts) { // пока на складе меньше товаров, чем хочет купить покупатель, покупатель ждет
            System.out.println("Покупатель не может купить " + newProducts + " товаров, так как на складе лежит " + products + " товаров");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        products -= newProducts; // вычитаем количество купленных товаров из общего числа товаров на складе
        System.out.println("Покупатель купил " + newProducts + " товаров");
        System.out.println("Товаров на складе: " + products);
        notifyAll(); // сообщаем всем потокам, что товары были куплены
    }

    public synchronized void put() {
        Random random = new Random();
        int newProducts = random.nextInt(maxProducts - minProducts + 1) + minProducts; // генерация случайного числа новых товаров

        while (products + newProducts > maxProducts) { // пока общее количество товаров на складе превышает максимально возможное число товаров, производитель ждет
            try {
                System.out.println("Производитель ждет освобождения места на складе");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        products += newProducts; // добавляем новые товары на склад
        System.out.println("Производитель поставил " + newProducts + " товаров");
        System.out.println("Товаров на складе: " + products);
        notifyAll(); // сообщаем всем потокам, что поставка новых товаров завершена
    }
}

class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.put();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            store.get();
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}