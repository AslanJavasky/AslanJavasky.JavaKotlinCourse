package mod9_algorithms.lesson16_output_to_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {

        String filePath = "assets/description2.txt";
        String data = "Aslan is the best teacher of Java programming!";

        try (PrintWriter pw = new PrintWriter(
                new FileWriter(filePath))) {
            pw.println(data);
            pw.printf("This is a number %.2f \n", 3.14159);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
