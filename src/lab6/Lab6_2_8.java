package lab6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab6_2_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в листе бумаги: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов в листе бумаги: ");
        int cols = scanner.nextInt();

        boolean[][] grid = new boolean[rows][cols];

        System.out.println("Введите расположение закрашенных клеток:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int cellValue = scanner.nextInt();
                grid[i][j] = (cellValue == 1);
            }
        }

        Map<String, Set<String>> figures = new HashMap<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j]) {
                    Set<String> cells = new HashSet<>();
                    String figure = findFigure(grid, i, j, rows, cols, cells);
                    if (figures.containsKey(figure)) {
                        figures.get(figure).addAll(cells);
                    } else {
                        figures.put(figure, cells);
                    }
                }
            }
        }

        System.out.println("Уникальные фигуры на клетчатом листе бумаги:");

        int count = 1;
        for (Map.Entry<String, Set<String>> entry : figures.entrySet()) {
            System.out.println("Фигура " + count++);
            System.out.println("Координаты закрашенных клеток: " + entry.getValue());
        }
    }

    private static String findFigure(boolean[][] grid, int i, int j, int rows, int cols, Set<String> cells) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || !grid[i][j]) {
            return "";
        }

        grid[i][j] = false;
        cells.add(i + "," + j);

        String left = findFigure(grid, i, j - 1, rows, cols, cells);
        String up = findFigure(grid, i - 1, j, rows, cols, cells);
        String right = findFigure(grid, i, j + 1, rows, cols, cells);
        String down = findFigure(grid, i + 1, j, rows, cols, cells);

        return "L" + left + "U" + up + "R" + right + "D" + down;
    }
}
