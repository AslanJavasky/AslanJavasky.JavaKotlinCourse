package mod9_algorithms.lesson15_input_from_file;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesDemo {
    public static void main(String[] args) {
        String filePath = "assets/description.txt";
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
