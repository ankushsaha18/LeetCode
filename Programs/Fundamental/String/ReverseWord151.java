import java.util.Arrays;

public class ReverseWord151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        char arr[] = s.toCharArray();
        char ans[] = new char[s.length() + 1];
        int i = s.length() - 1, index = 0;
        while (i >= 0) {
            while (i >= 0 && arr[i] == ' ') {
                i--;
            }
            if (i < 0) {
                break;
            }
            int j = i;
            while (i >= 0 && arr[i] != ' ') {
                i--;
            }
            for (int k = i + 1; k <= j; k++) {
                ans[index++] = arr[k];
            }
            ans[index++] = ' ';
        }
        return new String(ans, 0, index - 1);
    }
}
