//9. Используя оператор switch, написать программу, которая выводит на экран сообщения
// о принадлежности некоторого значения k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k].

package lab2;

import java.util.Scanner;

import static lab2.Lab2_1_8.printInfo;

public class Lab2_1_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input k: ");
        int k = in.nextInt();
        choiceInterval(k);
        printInfo();
    }

    public static void choiceInterval(int k) {
        String result = switch (getInterval(k)) {
            case 1 -> "k is in range (-10k, 0]";
            case 2 -> "k is in range (0, 5]";
            case 3 -> "k is in range (5, 10]";
            case 4 -> "k is in range (10, 10k]";
            default -> "error";
        };
        System.out.println(result);
    }

    public static int getInterval(int k) {
        int interval;
        if (k <= 0) {
            interval = 1;
        } else if (k <= 5) {
            interval = 2;
        } else if (k <= 10) {
            interval = 3;
        } else {
            interval = 4;
        }
        return interval;
    }
}
