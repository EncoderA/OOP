import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        String filePath = "file.txt";
        try {
            File file = new File(filePath);
            Scanner sc = new Scanner(file);
            if (file.exists()) {
                System.out.println("File already exists.");
            } else {
                if (file.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Failed to create file.");
                }
            }
            FileWriter writer = new FileWriter(file);
            writer.write("OOP Oral");
            writer.write("Moye Moye");
            //delete the string from the file
            writer.close();

            System.out.println("Content written to the file.");

            if(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
