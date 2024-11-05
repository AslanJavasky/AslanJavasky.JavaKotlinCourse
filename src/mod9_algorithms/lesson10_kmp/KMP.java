package mod9_algorithms.lesson10_kmp;

//text: "abcabcabcabc"
//pattern: "abc"

public class KMP {

    private static int[] computePrefixArray(String pattern) {
        int m = pattern.length();
        int[] prefixArray = new int[m];
        int length = 0;
        int i = 1;
        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                prefixArray[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = prefixArray[length - 1];
                } else {
                    prefixArray[i] = 0;
                    i++;
                }
            }
        }
        return prefixArray;
    }

    public static void KMPSearch(String text, String pattern) {
        //O(n+m)
        int n = text.length();
        int m = pattern.length();

        int[] prefixArray = computePrefixArray(pattern);

        int i = 0;//Индекс для текста
        int j = 0;//Индекс для шаблона
        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                System.out.println("Substring found at index: " + (i - j));
                j = prefixArray[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = prefixArray[j - 1];
                } else {
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String text="abcabcabcabc";
        String pattern="abc";
        KMPSearch(text,pattern);
        KMPSearch("Aslan is the best teacher of Java programming language!","Java");
    }

}
