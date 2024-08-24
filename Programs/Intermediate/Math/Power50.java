package Intermediate.Math;

public class Power50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.0000,-2));
    }
    public static double myPow(double x, int n) {
        if(n < 0){
            return 1/power(x,-(long)n);
        }
        return power(x,n);
    }
    public static double power(double x, long n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        if(n%2 == 0){
            return power(x*x,n/2);
        }else{
            return x*power(x,n-1);
        }
    }
}
