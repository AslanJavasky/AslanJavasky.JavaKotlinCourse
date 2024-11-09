package mod9_algorithms.lesson14_files;

import java.util.List;
import java.io.File;
import java.util.ArrayList;

public class FileSearcher {

    public static void main(String[] args) {

        File desktop = new File("C:/Users/User/Desktop/");

        List<String> fileNames = findFilesInDirectory(desktop);

        for (String fileName : fileNames) {
            System.out.println(fileName);
        }

    }

    private static List<String> findFilesInDirectory(File dir) {

        List<String> filesNames = new ArrayList<>();

        if (dir.exists() && dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files != null){
                for (File f: files){
                    if (f.isFile()){
                        filesNames.add(f.getName());
                    }else if (f.isDirectory()){
                        filesNames.addAll(findFilesInDirectory(f));
                    }
                }
            }
        }
        return filesNames;
    }
}
