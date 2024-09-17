package Fundamental.Array;

public class MaximumSubarray53 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for(int i : nums){
            sum += i;
            ans = Math.max(ans,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}
