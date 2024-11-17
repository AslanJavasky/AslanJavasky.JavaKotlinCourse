package mod9_algorithms.lesson15_input_from_file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderDemo {

    public static void main(String[] args) {

        String filePath = "assets/description.txt";
        StringBuilder sb = new StringBuilder();

        //without BufferedReader
//        try (
//                FileInputStream fis = new FileInputStream(filePath);
//                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
//        ) {
//            int code;
//            while ((code = isr.read()) != -1) {
//                char ch = (char) code;
//                sb.append(ch);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //with BufferedReader
        try (
                FileInputStream fis = new FileInputStream(filePath);
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
        ) {

            while (true) {
                String line = br.readLine();
                if (line == null) break;
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sb);
    }
}
