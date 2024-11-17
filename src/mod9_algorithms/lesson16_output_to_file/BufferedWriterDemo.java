package mod9_algorithms.lesson16_output_to_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {

        String filePath = "assets/description2.txt";
        String data = "Aslan is the best teacher of Java programming!";

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(filePath))) {
            bw.write(data);
            bw.newLine();
            bw.write("523");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
