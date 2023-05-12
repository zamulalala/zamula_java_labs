package lab9;

import java.util.Arrays;
import java.util.List;

public class Lab9_1_9 {
    public static void main(String[] args) {
        // Создаем коллекцию строк
        List<String> strings = Arrays.asList("apple", "banana", "pear", "banana", "orange", "apple");

        // Задаем строку, которую будем искать
        String searchString = "banana";

        // Фильтруем строки и находим количество вхождений искомой строки
        long count = strings.stream()
                .filter(s -> s.equals(searchString))
                .count();

        // Выводим количество вхождений на экран
        System.out.println(count);
    }
}
