package lab7;

import java.util.Scanner;

public class Lab7_3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите закодированную строку: ");
        String encodedStr = scanner.nextLine();

        String decodedStr = decode(encodedStr);
        System.out.println("Расшифрованная строка: " + decodedStr);
    }

    public static String decode(String encodedStr) {
        StringBuilder decodedBuilder = new StringBuilder();
        int n = encodedStr.length();
        int numCols = (int) Math.ceil(n / 3.0); // вычисляем количество столбцов

        char[][] matrix = new char[3][numCols]; // создаем матрицу

        // заполняем матрицу символами из закодированной строки
        int index = 0;
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < 3; row++) {
                if (index < n) {
                    matrix[row][col] = encodedStr.charAt(index++);
                }
            }
        }

        // переводим матрицу обратно в строку
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < numCols; col++) {
                if (matrix[row][col] != 0) {
                    decodedBuilder.append(matrix[row][col]);
                }
            }
        }

        return decodedBuilder.toString();
    }

}
