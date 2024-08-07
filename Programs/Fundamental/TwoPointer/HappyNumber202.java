package Fundamental.TwoPointer;

public class HappyNumber202 {
    public static void main(String[] args) {
        int n = 1111111;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
          slow = squareSum(slow);
          fast = squareSum(squareSum(fast));
          if(fast == 1){
              return true;
          }
        }while (fast != slow);
        return false;
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
