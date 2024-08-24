package Intermediate.BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtracking(ans,temp,nums,0);
        return ans;
    }
    public static void backtracking(List<List<Integer>> ans,List<Integer> temp,int[] nums,int index){
        if(index == nums.length){
            // add new arraylist as adding directly will cause change in all elements and all will be similar
            ans.add(new ArrayList<>(temp));
            return;
        }
        backtracking(ans,temp,nums,index+1); // skip the current index and move to next
        temp.add(nums[index]); // add the value of current index and move to next
        backtracking(ans,temp,nums,index+1);
        temp.remove(temp.size() - 1);  // remove the last added value to clear the temp list
    }
}
