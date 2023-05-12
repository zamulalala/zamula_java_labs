package lab9;

import java.util.Arrays;
import java.util.List;

public class Lab9_2_8 {
    public static void main(String[] args) {
        //Мы сначала создали коллекцию numbers с помощью метода Arrays.asList.
        List<Integer> numbers = Arrays.asList(7, 14, 21, 28, 35, 42, 49, 50);
        // Затем мы использовали stream() для создания потока элементов этой коллекции.
        int sum = numbers.stream()
                //Метод filter() используется для фильтрации элементов потока, чтобы оставить только те, которые кратны 7.
                .filter(n -> n % 7 == 0)
                //Метод mapToInt() используется для преобразования каждого элемента потока в примитивный тип int.
                .mapToInt(Integer::intValue)
                //Наконец, мы вызываем метод sum() для суммирования всех элементов потока.
                // Результат сохраняется в переменной sum, которая затем выводится на экран.
                .sum();
        System.out.println("Сумма всех кратных 7: " + sum);
    }
}

