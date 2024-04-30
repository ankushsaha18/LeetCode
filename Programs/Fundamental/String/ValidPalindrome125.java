public class ValidPalindrome125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if (!((c1 >= 48 && c1 <= 57) || (c1 >= 65 && c1 <= 90)
                    || (c1 >= 97 && c1 <= 122))) {
                i++;
            } else if (!((c2 >= 48 && c2 <= 57) || (c2 >= 65 && c2 <= 90)
                    || (c2 >= 97 && c2 <= 122))) {
                j--;
            } else {
                if (c1 >= 'A' && c1 <= 'Z') {
                    c1 = (char) (c1 + 'a' - 'A');
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    c2 = (char) (c2 + 'a' - 'A');
                }
                if (c1 != c2) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
