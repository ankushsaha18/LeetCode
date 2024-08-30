package Fundamental.Array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII216 {
    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        function(ans,temp,k,n,1);
        return ans;
    }
    public static void function(List<List<Integer>> ans, List<Integer> temp,int k,int n,int current){
        // If size reached required length check if sum is achieved
        if(temp.size() == k){
            if(n==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        // If sum is greater i.e. n is negative or current crosses 9 return
        if(n<0 || current>9){
            return;
        }
        // Treat current as the number i.e. nums[index]
        function(ans,temp,k,n,current+1);
        temp.add(current);
        function(ans,temp,k,n-current,current+1);
        temp.remove(temp.size()-1);
    }
}
