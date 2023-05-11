package lab7;

import java.util.*;

public class Lab7_3_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите русский текст:");
        String text = scanner.nextLine();

        // Разбиваем текст на слова и помещаем их в массив
        String[] words = text.split("\\s+");

        // Сортируем массив по первой букве слова
        Arrays.sort(words, Comparator.comparing(word -> word.substring(0, 1)));

        // Начинаем печатать слова, начинающиеся с новой буквы, с красной строки
        String currentLetter = "";
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            if (!firstLetter.equals(currentLetter)) {
                currentLetter = firstLetter;
                System.out.println();
            }
            System.out.print(word + " ");
        }
    }
}
