package Lab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab5_1_9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество уравнений: ");
        int n;

        try {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Необходимо ввести число типа int");
            return;
        }

        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();

        if ((long) n * 16 > maxMemory - totalMemory + freeMemory) {
            System.out.println("Недостаточно памяти");
            return;
        }

        QuadraticEquation[] array;

        try {
            array = new QuadraticEquation[n];
        } catch (NegativeArraySizeException e) {
            System.out.println("Количество уравнений должно быть положительным");
            return;
        }


        for (int i = 0; i < n; i++) {
            System.out.println("Уравнение #" + (i + 1));
            System.out.print("Введите коэффициент a: ");
            double a;
            try {
                a = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Коэффициент a должен быть числом");
                return;
            }

            System.out.print("Введите коэффициент b: ");
            double b;
            try {
                b = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Коэффициент b должен быть числом");
                return;
            }

            System.out.print("Введите коэффициент c: ");
            double c;
            try {
                c = in.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Коэффициент c должен быть числом");
                return;
            }

            QuadraticEquation q = new QuadraticEquation(a, b, c);
            array[i] = q;

            double[] roots = q.findRoot();
            double maxRoot = Double.NEGATIVE_INFINITY;
            double minRoot = Double.POSITIVE_INFINITY;

            for (double root : roots) {
                if (root > maxRoot) {
                    maxRoot = root;
                }
                if (root < minRoot) {
                    minRoot = root;
                }
            }

            System.out.println("Максимальный корень = " + String.format("%.4f", maxRoot));
            System.out.println("Минимальный корень = " + String.format("%.4f", minRoot));
        }
    }
}
