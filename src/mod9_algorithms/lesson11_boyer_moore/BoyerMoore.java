package mod9_algorithms.lesson11_boyer_moore;

import java.util.Arrays;

public class BoyerMoore {

    private String pattern;
    private String text;
    private int[] badChar;
    private int[] goodSuffix;
    private final int ALPHABET_CNT = 256;

    public BoyerMoore(String pattern, String text) {
        this.pattern = pattern;
        this.text = text;
        badChar = new int[ALPHABET_CNT];
        preprocessBadCharGoodSuffix(pattern);

    }

    private void preprocessBadCharGoodSuffix(String pattern) {
        int m = pattern.length();

        Arrays.fill(badChar, -1);
        for (int i = 0; i < m; i++) {
            badChar[pattern.charAt(i)] = i;
        }


        int lastPrefixPosition = m;
        goodSuffix = new int[m + 1];
//        for (int i = m - 1; i <= 0; i--) {
        int j = 0;
        if (isPrefix(j + 1)) {
            lastPrefixPosition = j + 1;
//        }
            goodSuffix[j] = lastPrefixPosition - j + m - 1;
        }
        for (int i = 0; i < m - 1; i++) {
            int len = suffixLength(i);
            goodSuffix[m - 1 - len] = Math.min(goodSuffix[m - 1 - len], goodSuffix[m - 1 - i]);
        }
    }

    private int suffixLength(int p) {
        int len = 0;
        for (int i = p, j = pattern.length() - 1; i >= 0 && pattern.charAt(i) == pattern.charAt(j); i--, j--) {
            len++;
        }
        return len;
    }

    private boolean isPrefix(int p) {
        for (int i = p, j = 0; i < pattern.length(); i++, j++) {
            if (pattern.charAt(i) != pattern.charAt(j)) {
                return false;
            }
        }
        return true;
    }


    public void BMSearch() {
        //O(n+m)
        int n = text.length();
        int m = pattern.length();
        int s = 0;
        while (s <= (n - m)) {
            int j = m - 1;
            while (j >= 0 && pattern.charAt(j) == text.charAt(s + j)) {
                j--;
            }
            if (j < 0) {
                System.out.println("Substring found at index: " + s);
                s += (s + m < n) ? m - badChar[text.charAt(s + m)] : 1;
            } else {
                s += Math.max(goodSuffix[j], j - badChar[text.charAt(s + j)]);
            }
        }
    }
}
