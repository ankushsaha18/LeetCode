package Array;

import java.util.Arrays;

public class TwoSum1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int lastIndex = nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
                else if(nums[lastIndex-i] + nums[lastIndex-j] == target){
                    return new int[]{lastIndex - i,lastIndex - j};
                }
            }
        }
        return new int[]{0,0};
    }
}

