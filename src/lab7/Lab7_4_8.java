package lab7;

import java.util.Scanner;

public class Lab7_4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите слово для поиска: ");
        String word = scanner.next();

        int count = 0;
        int index = 0;
        while ((index = text.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        System.out.println("Слово \"" + word + "\" встречается в тексте " + count + " раз.");
    }
}
