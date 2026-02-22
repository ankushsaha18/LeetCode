package Advanced.DynamicProgramming;

public class HouseRobber198 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int prev1 = nums[0];
        int prev2 = Math.max(nums[0],nums[1]);
        for(int i = 2 ; i < n ; i++){
            int f1 = nums[i] + prev1;
            prev1 = prev2;
            prev2 = Math.max(f1,prev2);
        }
        return prev2;
    }
}
