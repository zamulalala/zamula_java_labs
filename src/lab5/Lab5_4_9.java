package lab5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab5_4_9 {
    public static void main(String[] args) {
        File inputFile = new File("input_5_4_9.txt");
        File outputFile = new File("output_5_4_9.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                String first = words[0];
                String last = words[words.length - 1];

                words[0] = last;
                words[words.length - 1] = first;

                String newLine = String.join(" ", words);
                bw.write(newLine);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading/writing file");
            e.printStackTrace();
        }

    }
}

