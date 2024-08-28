package Fundamental.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII90 {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        function(ans,temp,nums,0);
        return ans;
    }
    public static void function(List<List<Integer>> ans,List<Integer> temp,int[] nums,int index){
        if(index == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        function(ans,temp,nums,index+1);
        temp.remove(temp.size() - 1);
        for(int i = index + 1 ; i < nums.length ; i++){
            if(nums[i] != nums[i-1]){
                function(ans,temp,nums,i);
                return;
            }
        }
        // If duplicates not found we will call the function at length to end it
        function(ans,temp,nums,nums.length);
    }
}
