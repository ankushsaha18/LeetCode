package Intermediate.Math;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {  // Space Optimization
        if(n < 2){
            return 1;
        }
        int prev1 = 1;
        int prev2 = 1;
        for (int i = 2 ; i <= n ; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
