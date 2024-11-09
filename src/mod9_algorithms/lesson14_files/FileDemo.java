package mod9_algorithms.lesson14_files;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileDemo {
    public static void main(String[] args) {

        String pathFile = "C:\\Users\\User\\Desktop\\description.txt";
        File file = new File(pathFile);

        if (file.exists()) {
            System.out.println("File is exist!");
        } else {
            System.out.println("File isn't exist!");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("this file is Directory? " + file.isDirectory());
        System.out.println("file's name: \"" + file.getName() + "\"");
        System.out.println("cnt of bytes: " + file.length());
        System.out.println("last modification: " +
                new SimpleDateFormat("dd.MMMM.yyyy").format(file.lastModified()));

        File innerDir = new File("C:/Users/User/Desktop/New Directory1/New Directory2");
        System.out.println("Directory is created? " + innerDir.mkdirs());
//        System.out.println("Directory is created? "+newDir.mkdir());

        File newDir = new File("C:/Users/User/Desktop/New Directory1/");
        System.out.println(newDir.getName());
        if (innerDir.exists()) System.out.println(innerDir.delete());
        if (newDir.exists()) System.out.println(newDir.delete());

        File dIscrFile = new File("C:/Users/User/Desktop/New Folder/discription.txt");
        System.out.println(dIscrFile.renameTo(
                new File("C:/Users/User/Desktop/New Folder/description.txt")));

        File desktop = new File("C:/Users/User/Desktop/");
        File[] files = desktop.listFiles();
        if (files != null) {
            for (File f:files){
                System.out.println(f.getName());
            }
        }

    }
}
