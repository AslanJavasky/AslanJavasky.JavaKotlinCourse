package practise;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long sum = (long) (n + 100) * (n - 100 + 1) / 2;

        System.out.println("Sum = " + sum);

    }
}
