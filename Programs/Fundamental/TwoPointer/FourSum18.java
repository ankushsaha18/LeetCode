package Fundamental.TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 3, 4, -3};
        System.out.println(fourSum(nums,5));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // Same as three sum just put that code inside a loop
        // In three sum we have had put that inside a loop and performed two sum
        // All three are interconnected
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if(n < 4){
            return ans;
        }
        Arrays.sort(nums);
        for(int i = 0 ; i < n-3 ; i++){
            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }
            for(int j = i+1 ; j < n-2 ; j++){
                if(j>i+1 && nums[j-1] == nums[j]){
                    continue;
                }
                int l = j+1;
                int r = n-1;
                while (l < r){
                    long sum = (long)nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum == target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                        while(l < r && nums[l-1] == nums[l]){
                            l++;
                        }
                        while (l < r && nums[r+1] == nums[r]){
                            r--;
                        }
                    }else if(sum < target){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }
        return ans;
    }
}
