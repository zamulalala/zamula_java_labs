package lab9;

import java.util.Arrays;
import java.util.List;

public class Lab9_2_9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 8, 1, 9, 3, 5, 2, 7, 6);

        // Находим максимум и минимум с помощью метода reduce()
        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        int min = numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);

        // Выводим результат
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
