package mod9_algorithms.lesson16_output_to_file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) {

        String filePath = "assets/description2.txt";
        String data = "523";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
//            fos.write(data.getBytes());
            fos.write(data.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
