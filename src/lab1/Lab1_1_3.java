//3. Создать приложение, выводящее n строк с переходом и без перехода на новую строку.

package lab1;

import java.util.Scanner;

public class Lab1_1_3 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Input n: ");
        int n = in.nextInt();
        String text = "Hello, Pavel Valeryevich!";
        printNewLine(n, text);
        printOneLine(n, text);
    }

    public static void printNewLine(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void printOneLine(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.print(text + " ");
        }
    }
}
