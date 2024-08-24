package Intermediate.BinarySearch;

public class SQRT69 {
    public static void main(String[] args) {
        int x = 21489876;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        long left = 0 , right = x;
        while (left <= right){
            long mid = left + (right - left)/2;
            long sq = mid*mid;
            if(sq == x){
                return (int)mid;
            }else if(sq > x){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return (int)right;
    }
}
