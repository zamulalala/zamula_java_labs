package lab7;

import java.util.Scanner;

public class Lab7_1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        scanner.close();

        // Удаляем все символы, кроме букв и пробелов
        text = text.replaceAll("[^a-zA-Z\\s]", "");

        // Удаляем лишние пробелы между словами
        text = text.replaceAll("\\s+", " ");

        // Выводим результат
        System.out.println("Результат: " + text);
    }
}
