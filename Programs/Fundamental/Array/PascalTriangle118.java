package Fundamental.Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                temp.add(ncr(i,j));
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
    public static int ncr(int n , int r){
        // factorial = n!/(n-r)!*r!
        long ans = 1;
        for(int i = 0 ; i < r ; i++){
            ans *= (n-i);
            ans /= (i+1);
        }
        return (int)ans;
    }
}
