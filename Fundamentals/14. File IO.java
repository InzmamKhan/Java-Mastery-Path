package JAVA.Fundamentals;

import java.io.*;

class abc13 {
    public static void main(String[] args) {
        String filePath = "JAVA/Source/Sample_File_For_Java_File_IO.txt";

        // 1. Writing to a file (overwrites if file exists)
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, Java File IO!\n");
            writer.write("This is a sample file.\n");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // 2. Appending to a file
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write("Appending a new line.\n");
            System.out.println("Line appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

        // 3. Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading file contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // 4. Editing (replacing) content in a file
        try {
            // Read all content
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Replace "Java" with "JAVA"
                    content.append(line.replace("Java", "JAVA")).append("\n");
                }
            }
            // Write back the modified content
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(content.toString());
            }
            System.out.println("File content edited (replaced 'Java' with 'JAVA').");
        } catch (IOException e) {
            System.out.println("Error editing file: " + e.getMessage());
        }
    }
}
