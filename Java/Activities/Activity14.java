package JavaActivities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {

    public static void main(String[] args) {

        try {
            // Create a new file using File class
            File file = new File("sample.txt");

            // Create the file
            boolean fileCreated = file.createNewFile();

            if (fileCreated) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Write text into the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello! This is sample text written into the file.");
            writer.close();

            System.out.println("Text written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
