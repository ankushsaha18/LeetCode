package Intermediate.BinarySearch;

public class SmallestLetterGreaterTarget744 {
    public static void main(String[] args) {
        char arr[] = { 'x', 'x', 'y', 'y' };
        System.out.println(nextGreatestLetter(arr, 'z'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int i = ceiling(letters, target);
        while (i < letters.length && letters[i] == target) {
            i++;
        }
        if (i < letters.length && target < letters[i]) {
            return letters[i];
        }
        return letters[0];
    }

    public static int ceiling(char[] letters, char target) {
        int i = 0, j = letters.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (target > letters[m]) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        return i;
    }
}
