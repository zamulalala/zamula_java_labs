package lab5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab5_3_9 {
    public static void main(String[] args) {
        String inputFilePath = "matrix.txt";
        String outputFilePath = "result02.txt";

        // Check if input and output file paths were provided as command line arguments
        if (args.length >= 2) {
            inputFilePath = args[0];
            outputFilePath = args[1];
        }

        // Read the input matrix from file
        int[][] matrix = readMatrixFromFile(inputFilePath);

        // Print the original matrix
        System.out.println("Original matrix:");
        printMatrix(matrix);

        // Rotate the matrix
        int[][] rotatedMatrix = rotateMatrix(matrix);

        // Print the rotated matrix
        System.out.println("Rotated matrix:");
        printMatrix(rotatedMatrix);

        // Write the rotated matrix to file
        writeMatrixToFile(rotatedMatrix, outputFilePath);
        System.out.println("Rotated matrix saved to " + outputFilePath);
    }

    // Reads a matrix from a file and returns it as a 2D array of integers
    private static int[][] readMatrixFromFile(String filePath) {
        int[][] matrix = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            // Determine the size of the matrix (assuming it is square)
            String line = reader.readLine();
            int size = line.split("\\s+").length;

            // Initialize the matrix
            matrix = new int[size][size];
            int row = 0;

            // Read the matrix from the file
            do {
                String[] values = line.split("\\s+");
                for (int col = 0; col < size; col++) {
                    matrix[row][col] = Integer.parseInt(values[col]);
                }
                row++;
            } while ((line = reader.readLine()) != null);

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        return matrix;
    }

    // Rotates a matrix by 90 degrees clockwise and returns the result as a new 2D array
    private static int[][] rotateMatrix(int[][] matrix) {
        int size = matrix.length;
        int[][] rotatedMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rotatedMatrix[j][size - i - 1] = matrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    // Prints a matrix to the console
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Writes a matrix to a file
    private static void writeMatrixToFile(int[][] matrix, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int[] row : matrix) {
                for (int value : row) {
                    writer.write(value + " ");
                }
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
            System.exit(1);
        }
    }
}

