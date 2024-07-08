package syntax.lesson14_scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = scanner.nextLine().trim();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

        System.out.println("Hello, my name is "+name+"! I'm a "+age+" years old.");
        scanner.close();
    }
}
