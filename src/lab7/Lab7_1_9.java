package lab7;

import java.util.Scanner;

public class Lab7_1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.println("Введите длину слова:");
        int length = scanner.nextInt();

        String[] words = text.split("\\s+"); // Разделяем текст на слова
        String result = "";

        for (String word : words) {
            if (word.length() != length || isVowel(word.charAt(0))) {
                result += word + " "; // Добавляем слово с пробелом к результату, если оно не соответствует условиям
            }
        }

        System.out.println("Результат:");
        System.out.println(result.trim()); // Выводим результат, убирая лишние пробелы в начале и в конце
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
