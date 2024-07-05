package Intermediate.Math;

public class palindrome9 {
    public static void main(String[] args) {
        int n = -121;
        System.out.println(isPalindrome(n));
    }
    public static boolean isPalindrome(int x) {
        String og = String.valueOf(x);
        int s = 0;
        int e = og.length()-1;
        while (s<e){
            if(og.charAt(s) != og.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
