package Lab5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Lab5_3_8 {

    public static void main(String[] args) {
        String inputFilePath = "poem.txt";
        String outputFilePath = "result.txt";

        // Создаем мапы для подсчета частоты повторяемости букв и слов
        Map<Character, Integer> charFrequencies = new HashMap<>();
        Map<String, Integer> wordFrequencies = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                // Подсчитываем частоту повторяемости букв
                for (char c : line.toCharArray()) {
                    if (charFrequencies.containsKey(c)) {
                        charFrequencies.put(c, charFrequencies.get(c) + 1);
                    } else {
                        charFrequencies.put(c, 1);
                    }
                }

                // Подсчитываем частоту повторяемости слов
                for (String word : words) {
                    if (wordFrequencies.containsKey(word)) {
                        wordFrequencies.put(word, wordFrequencies.get(word) + 1);
                    } else {
                        wordFrequencies.put(word, 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.format("Ошибка чтения файла: %s%n", e);
        }

        // Записываем результат в файл
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            bw.write("Частота повторяемости букв:\n");
            for (Map.Entry<Character, Integer> entry : charFrequencies.entrySet()) {
                bw.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            bw.write("\nЧастота повторяемости слов:\n");
            for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
                bw.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.err.format("Ошибка записи файла: %s%n", e);
        }

        System.out.println("Результат записан в файл " + outputFilePath);
    }

}
