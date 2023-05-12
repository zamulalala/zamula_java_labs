package lab9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lab9_1_8 {
    public static void main(String[] args) {
        // Создание списка строк с дубликатами
        List<String> listWithDuplicates = Arrays.asList("apple", "banana", "pear", "banana", "orange", "apple");

        // Получение списка строк без дубликатов с помощью метода distinct()
        List<String> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        // Вывод списка без дубликатов на консоль
        System.out.println(listWithoutDuplicates);
    }
}
