package practise;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int infectedCnt = getInfectedCount(n);

        System.out.println("Count of infected is " + infectedCnt);

    }

    private static int getInfectedCount(int n) {
        if (n == 1) {
            return 1;
        }
        return 4 * (n - 1) + getInfectedCount(n - 1);
    }
}
