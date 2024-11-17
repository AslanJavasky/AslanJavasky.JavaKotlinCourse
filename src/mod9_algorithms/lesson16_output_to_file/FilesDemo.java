package mod9_algorithms.lesson16_output_to_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesDemo {
    public static void main(String[] args) {

        String filePath = "assets/description2.txt";
        String data = "Aslan is the best teacher of Java programming!";

        try {
            Files.writeString(Path.of(filePath),"555", StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            Files.write(Path.of(filePath),List.of(data,"523"),StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
