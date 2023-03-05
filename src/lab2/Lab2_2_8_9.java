//Ввести с консоли n – размерность матрицы a[n][n].
// Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.
// Вычислить определитель матрицы.
//Построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.

package lab2;


import java.util.Random;
import java.util.Scanner;

import static lab2.Lab2_1_8.printInfo;

public class Lab2_2_8_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = scanner.nextInt();
        int[][] matrix = createMatrix(n);
        printIntMatrix(matrix);
        int determinant = getMatrixDeterminant(matrix);
        System.out.println("Determinant of matrix = " + determinant);
        double[][] newMatrix = newMatrix(matrix);
        printDoubleMatrix(newMatrix);
        printInfo();
    }

    public static int[][] createMatrix(int n) {
        int[][] matrix = new int[n][n];
        Random random = new Random();
        int range = n * 2 + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(range) - n;
            }
        }
        return matrix;
    }

    public static int getMatrixDeterminant(int[][] matrix) {
        int n = matrix.length;
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        }
        int total = 0;
        for (int l = 0; l < n; l++) {
            int rootElement = matrix[l][0];

            int[][] subMatrix = new int[n-1][n-1];
            int temp_i = 0;
            for (int i = 0; i < n; i++) {
                if (i!= l) {
                    for (int j = 1; j < n; j++) {
                        subMatrix[temp_i][j - 1] = matrix[i][j];
                    }
                    temp_i ++;
                }
            }

            int subDeterminant = getMatrixDeterminant(subMatrix);

            int sign = 1;
            if (l % 2 != 0)  sign = -1;

            total += sign * rootElement * subDeterminant;
        }
        return total;

    }

    public static void printIntMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", ints[j]);
            }
            System.out.println();
        }
    }

    public static double[][] newMatrix(int[][] matrix) {
        int n = matrix.length;
        double[][] newMatrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            double averageOfRow = averageOfRow(i, matrix);
            for (int j = 0; j < n; j++) {
                newMatrix[i][j] = matrix[i][j] - averageOfRow;
            }
        }
         return newMatrix;
    }

    public static double averageOfRow(int i, int[][] matrix) {
        int n = matrix.length;
        double sumRow = 0;
        for (int j = 0; j < n; j++) {
            sumRow += matrix[i][j];
        }
        return sumRow/n;
    }

    public static void printDoubleMatrix(double[][] matrix) {
        int n = matrix.length;
        for (double[] doubles : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6.2f", doubles[j]);
            }
            System.out.println();
        }
    }
}
