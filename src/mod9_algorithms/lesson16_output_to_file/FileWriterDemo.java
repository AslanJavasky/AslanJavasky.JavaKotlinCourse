package mod9_algorithms.lesson16_output_to_file;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterDemo {
    public static void main(String[] args) {

        String filePath = "assets/description2.txt";
        String data = "Aslan is the best teacher of Java programming!";

        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
