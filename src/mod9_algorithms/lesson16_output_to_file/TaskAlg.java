package mod9_algorithms.lesson16_output_to_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TaskAlg {
    public static void main(String[] args) {

        String filePath = "assets/description.txt";
        Path path = Path.of(filePath);

        try {
            List<String> lines = Files.readAllLines(path);
            List<String> updatedLines = lines.stream().map(elem -> elem + " 555").toList();
            Files.write(path, updatedLines, StandardOpenOption.CREATE);
            System.out.println("Algorithms done!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
