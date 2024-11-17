package mod9_algorithms.lesson15_input_from_file;

import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args) {

        String filePath = "assets/description.txt";
        StringBuilder sb = new StringBuilder();

        try (
                FileReader fr = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fr);
        ) {
            while (true) {
                String line=br.readLine();
                if (line==null) break;
                sb.append(line+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(sb);
    }
}
