package lab8;

public class Lab8_1_2 {
    public static void main(String[] args) {
        // Создаем два потока для левой и правой руки
        Thread leftArmThread = new Thread(new LeftArm());
        Thread rightArmThread = new Thread(new RightArm());

        // Запускаем потоки
        leftArmThread.start();
        rightArmThread.start();
    }
}

// Класс, реализующий левую руку
class LeftArm implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("LEFT HAND");
            try {
                Thread.sleep(1000); // пауза в 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Класс, реализующий правую руку
class RightArm implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("RIGHT HAND");
            try {
                Thread.sleep(1000); // пауза в 1 секунду
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

