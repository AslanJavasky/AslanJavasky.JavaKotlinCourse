package mod9_algorithms.lesson8_naive_substring_search;

//text: "Aslan is the best teacher of Java"
//pattern: "Java"

public class NaiveSubstringSearch {

    public static int naiveSearch(String text, String pattern) {

        //O(n*m),где n=text.length(), m=pattern.length()...O(n)

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "Aslan is the best teacher of Java";
        String pattern = "Java";
        System.out.println(naiveSearch(text, pattern));
        System.out.println(naiveSearch("sdkjgfbsdhjfgasgf", "Aslan"));
        System.out.println(naiveSearch("Kotlin is a conсise version of Java", "Kotlin"));
    }

}
