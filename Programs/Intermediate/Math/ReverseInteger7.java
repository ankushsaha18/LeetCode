package Intermediate.Math;

public class ReverseInteger7 {
    public static void main(String[] args) {
        System.out.println(reverse(1258));
    }
    public static int reverse(int x) {
        long ans = 0;
        int n = x;
        x = Math.abs(x);
        while(x > 0){
            int temp = x % 10;
            ans = ans * 10 + temp;
            x /= 10;
        }
        if(ans > Integer.MAX_VALUE){
            return 0;
        }
        if(n < 0){
            return -1* (int)ans;
        }
        return (int)ans;
    }
}
