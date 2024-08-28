package Fundamental.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII40 {
    public static void main(String[] args) {
        int[] candidates = {2, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum2(candidates,8));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        function(ans,temp,0,target,candidates);
        return ans;
    }
    public static void function(List<List<Integer>> ans,List<Integer> temp,int index,int target,int[] candidates) {
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0 || index == candidates.length){
            return;
        }
        // This one is for taking the index
        temp.add(candidates[index]);
        function(ans,temp,index+1,target - candidates[index],candidates);
        temp.remove(temp.size()-1);
        for(int i = index + 1 ; i < candidates.length ; i++){
            // This one is for skipping to the next different index
            if(candidates[i] != candidates[i-1]){
                function(ans,temp,i,target,candidates);
                // The break is important because if we find the diff one we will go back
                return;
            }
            if(candidates[i] > target){
                return;
            }
        }
    }
}
