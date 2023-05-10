package lab6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab6_1_9 {
    public static void main(String[] args) {
        File file = new File("lab6_1_9.txt"); // замените на имя вашего файла
        Set<String> words = new HashSet<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase();
                words.add(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Уникальные слова в файле:");
        System.out.println(words);
    }
}
