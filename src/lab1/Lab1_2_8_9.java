//Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести: простые числа

package lab1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lab1_2_8_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input numbers and press Enter: ");
        String text = in.nextLine();
        String[] words = text.split(" ");
        Integer[] numbers = new Integer[words.length];
        for (int i = 0; i < words.length; i++) {
            numbers[i] = Integer.parseInt(words[i]);
        }
        printSimpleDigits(numbers);
        printSortedArray(numbers);
        printSortedArrayReverse(numbers);
    }

    public static void printSimpleDigits(Integer[] numbers) {
        for (Integer number : numbers) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return (n % 2 != 0 && prime && n > 2) || n == 2;
    }

    public static void printSortedArray(Integer[] numbers) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void printSortedArrayReverse(Integer[] numbers) {
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}
