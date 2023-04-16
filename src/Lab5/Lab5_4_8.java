package Lab5;

import java.io.*;

public class Lab5_4_8 {
    public static void main(String[] args) {
        File inputFile = new File("input.java");
        File outputFile = new File(inputFile.getParent(), "output.java");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            boolean isMultiLineComment = false;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                // Check for multi-line comments
                if (isMultiLineComment) {
                    int endIndex = line.indexOf("*/");

                    if (endIndex != -1) {
                        // End of multi-line comment found
                        line = line.substring(endIndex + 2);
                        isMultiLineComment = false;
                    } else {
                        // Still inside multi-line comment
                        continue;
                    }
                }

                // Check for single-line comments
                int commentIndex = line.indexOf("//");

                if (commentIndex != -1) {
                    // Single-line comment found
                    line = line.substring(0, commentIndex);
                } else {
                    // Check for start of multi-line comment
                    commentIndex = line.indexOf("/*");

                    if (commentIndex != -1) {
                        // Start of multi-line comment found
                        int endIndex = line.indexOf("*/", commentIndex);

                        if (endIndex != -1) {
                            // End of multi-line comment found on the same line
                            line = line.substring(0, commentIndex) + line.substring(endIndex + 2);
                        } else {
                            // End of multi-line comment not found on the same line
                            line = line.substring(0, commentIndex);
                            isMultiLineComment = true;
                        }
                    }
                }

                // Write the line to the output file
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Comments removed successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while removing comments: " + e.getMessage());
        }
    }
}
