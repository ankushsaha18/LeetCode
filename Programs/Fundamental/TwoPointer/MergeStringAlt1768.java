package Fundamental.TwoPointer;

public class MergeStringAlt1768{
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrsdge";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int i = 0;

        StringBuilder merged = new StringBuilder();

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                merged.append(word2.charAt(i));
            }
            i++;
        }

        return merged.toString();
    }

}
