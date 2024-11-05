package mod9_algorithms.lesson9_rabin_karp_substring_search;

//text: "Aslan is the best teacher of Java"
//pattern: "Java"

public class RabinKarp {

    private static final int ALPHABETS_CNT = 256;
    private static final int PRIME_NUMBER = 101;

    public static void search(String text, String pattern) {
        //O(n+m)...O(n*m)
        int textLength = text.length();
        int patternLength = pattern.length();

        int hashOfText = 0;//хэш текущего окна
        int hashOfPattern = 0;//хеш
        int hashMultiplier = 1;

        //хэш-коды для подстроки и первого окна текста
        for (int i = 0; i < patternLength; i++) {
            hashOfPattern = (ALPHABETS_CNT * hashOfPattern + pattern.charAt(i)) % PRIME_NUMBER;
            hashOfText = (ALPHABETS_CNT * hashOfText + text.charAt(i)) % PRIME_NUMBER;
        }

        //Множитель для самой первой буквы хэш-кода шаблона
        for (int i = 0; i < patternLength - 1; i++) {
            hashMultiplier = (hashMultiplier * ALPHABETS_CNT) % PRIME_NUMBER;
        }

        //Сравнивание хэш-кодов окна текста и паттерна
        for (int i = 0; i <= textLength - patternLength; i++) {
            if (hashOfPattern == hashOfText) {

                int j = 0;
                for (j = 0; j < patternLength; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) break;
                }
                if (j == patternLength) {
                    System.out.println("Substring found at index: " + i);
                }
            }

            if (i < textLength - patternLength) {
                hashOfText = (ALPHABETS_CNT * (hashOfText - text.charAt(i) * hashMultiplier) +
                        text.charAt(i + patternLength)) % PRIME_NUMBER;
                if (hashOfText < 0) hashOfText += PRIME_NUMBER;
            }
        }
    }

    public static void main(String[] args) {
        String text = "Aslan is the best teacher of Java";
        String pattern = "Java";
        search(text, pattern);
        search("sdkjgfbsdhjfgasgf", "Aslan");
        search("Kotlin is a Kotlin conсise abracadabra version of Java", "Kotlin");
    }
//        System.out.println(naiveSearch("sdkjgfbsdhjfgasgf", "Aslan"));
//        System.out.println(naiveSearch("Kotlin is a conсise version of Java", "Kotlin"));
}

