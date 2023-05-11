package lab7;

import java.util.Scanner;

public class Lab7_2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine();

        System.out.print("Введите стоимость одного слова: ");
        double wordCost = scanner.nextDouble();

        // Разбиваем сообщение на слова и считаем количество слов
        String[] words = message.split("\\s+");
        int wordCount = words.length;

        // Вычисляем стоимость телеграммы
        double telegramCost = wordCost * wordCount;

        // Печатаем квитанцию об оплате телеграммы
        System.out.println("\nКвитанция об оплате телеграммы:");
        System.out.println("Количество слов: " + wordCount);
        System.out.println("Стоимость одного слова: " + wordCost + " руб.");
        System.out.println("Стоимость телеграммы: " + telegramCost + " руб.");
    }
}
