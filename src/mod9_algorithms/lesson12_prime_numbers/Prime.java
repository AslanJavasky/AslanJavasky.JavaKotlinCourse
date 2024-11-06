package mod9_algorithms.lesson12_prime_numbers;

public class Prime {

    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71};

    public static boolean isPrime(int number) {
        if (number > 1 && number <= 3) return true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(24));
        System.out.println(isPrime(4));
        System.out.println(isPrime(23));
    }


}
