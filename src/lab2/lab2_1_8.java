//8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром.
// Если таких слов больше одного, найти второе из них.

package lab2;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class lab2_1_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input words and press Enter: ");
        String text = in.nextLine();
        String[] words = text.split(" ");

        int[] numbers = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            try {
                numbers[i] = Integer.parseInt(words[i]);
            } catch  (NumberFormatException ignored){

            }
        }
        findPalindromes(numbers);
        printInfo();
    }

    public static void findPalindromes(int[] numbers) {
        int toPrintPalindrome = 0;

        for (int number : numbers) {
            if (number != 0 && isPalindrome(number)) {
                if (toPrintPalindrome == 0) {
                    toPrintPalindrome = number;
                } else {
                    toPrintPalindrome = number;
                    break;
                }
            }
        }
        System.out.println(toPrintPalindrome);
    }
    public static boolean isPalindrome(int num) {

        int reversedNum = 0;
        int remainder;
        int originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void printInfo() {
        System.out.println("Разработчик: Замула М.И.");

        System.out.println("Дата получения задания: " + LocalDate.of(2023, 1, 17));

        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        System.out.println("Дата сдачи задания: " + formatter.format(date));

    }
}
