package syntax.lesson16_if;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13) {
            System.out.println("You are an teenager.");
        } else {
            System.out.println("You are an infant.");
        }

        scanner.close();

    }
}
