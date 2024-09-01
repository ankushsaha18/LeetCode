package Intermediate.Math;

public class DivideTwoIntegers29 {
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1));
    }
    public static int divide(int dividend, int divisor) {
        if(dividend == divisor){
            return 1;
        }
        // if both same sign then positive
        int sign = ((dividend >= 0) == (divisor >= 0))? 1 : -1;
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int ans = 0;
        // iterate and reduce 2^cnt
        while (n >= d){
            int cnt = 0;
            // check if n is greater than 2^cnt+1
            while (n >= (d << cnt+1)){
                cnt++;
            }
            // add to the answer and reduce from numerator
            ans += (1 << cnt);
            n -= (d << cnt);
        }
        // check edge cases
        if(ans == (1<<31)){
            if(sign == -1){
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
        return sign*ans;
    }
}
