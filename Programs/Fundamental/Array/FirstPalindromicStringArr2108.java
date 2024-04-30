public class FirstPalindromicStringArr2108 {
    public static void main(String[] args) {
        String words[] = { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for (String i : words) {
            if (isPalindrome(i)) {
                return i;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
