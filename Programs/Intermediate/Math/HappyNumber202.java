package Intermediate.Math;

public class HappyNumber202 {
    public static void main(String[] args) {
        int n = 1111111;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int slow = squareSum(n);
        int fast = squareSum(squareSum(n));

        while(fast != 1){
            slow = squareSum(slow);
            fast = squareSum(squareSum(fast));
            if(slow == fast){
                return false;
            }
        }
        return true;
    }
    public static int squareSum(int n){
        int ans = 0;
        while(n > 0){
            ans += (n%10) * (n%10);
            n/=10;
        }
        return ans;
    }
}
