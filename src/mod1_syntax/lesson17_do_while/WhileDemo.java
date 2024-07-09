package mod1_syntax.lesson17_do_while;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

        int cnt = 0;
        //while
//        while (cnt < 3) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter your age: ");
//            int age = scanner.nextInt();
//
//            if (age >= 18) {
//                System.out.println("You are an adult.");
//            } else if (age >= 13) {
//                System.out.println("You are an teenager.");
//            } else {
//                System.out.println("You are an infant.");
//            }
//            cnt++;
////            scanner.close();
//        }
//        System.out.println("Exit from while-cycle");


        //do-while
        do {
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
            cnt++;
//            scanner.close();
        } while (cnt < 4);
        System.out.println("Exit from while-cycle");
    }
}
