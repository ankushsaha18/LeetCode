package Fundamental.Array;
import java.util.Arrays;

public class RunningSumArr1480 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int prev = 0;
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] + prev;
            prev = nums[i];
        }
        return nums;
    }
}
