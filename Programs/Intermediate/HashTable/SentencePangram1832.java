package Intermediate.HashTable;

public class SentencePangram1832 {
    public static boolean checkIfPangram(String sentence) {
        String temp = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < temp.length(); i++) {
            if (!sentence.contains(String.valueOf(temp.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "Ankush";
        System.out.println(checkIfPangram(test));
    }
}
