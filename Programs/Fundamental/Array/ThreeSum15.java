package Fundamental.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public static void main(String[] args) {
        int[] nums = {2, -2, 0, 3, -3, 5};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        // Fix a value and perform two sum on it
        List<List<Integer>> ans = new ArrayList<>();
        // If want to skip this part of duplicate handling use a HashSet instead of ArrayList
        // It will take O(n) space complexity
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){ // for loop is for fixing a value
            if(i>0 && nums[i-1] == nums[i]){
                // skip duplicates
                continue;
            }
            // After this perform two sum
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    // Again skip duplicates
                    while (left < right && nums[left-1] == nums[left]){
                        left++;
                    }
                    while (left < right && nums[right+1] == nums[right]){
                        right--;
                    }
                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}
