package Advanced.DynamicProgramming;

public class HouseRobberII213 {
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int s1 = 0;
        int prev1 = 0;
        int prev2 = nums[1];
        for(int i = 2 ; i < n ; i++){
            int f1 = nums[i] + prev1;
            prev1 = prev2;
            prev2 = Math.max(f1,prev2);
        }
        s1 = prev2;
        prev1 = nums[0];
        prev2 = Math.max(nums[0],nums[1]);
        for (int i = 2 ; i < n-1 ; i++){
            int f1 = nums[i] + prev1;
            prev1 = prev2;
            prev2 = Math.max(f1,prev2);
        }
        return Math.max(s1,prev2);
    }
}
