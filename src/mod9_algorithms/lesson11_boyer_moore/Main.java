package mod9_algorithms.lesson11_boyer_moore;

public class Main {
    public static void main(String[] args) {
        //O(n+m)
        BoyerMoore alg = new BoyerMoore("Java", "Aslan is the best teacher of Java language");
        alg.BMSearch();

        BoyerMoore alg2 = new BoyerMoore("ABAC", "ABCABACABACD");
        alg2.BMSearch();

        BoyerMooreAlg algKotlin = new BoyerMooreAlg("ABAC", "ABCABACABACD");
        algKotlin.BMSearch();

        System.out.println();
        BoyerMooreAlg algKotlin2 = new BoyerMooreAlg("ABC", "ABCABACABABCACABCDLKKKHKLKABC");
        algKotlin2.BMSearch();

    }
}
