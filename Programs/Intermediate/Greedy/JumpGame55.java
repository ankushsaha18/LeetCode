package Intermediate.Greedy;

public class JumpGame55 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        // To count the maximum index we can jump from that index
        int maxIndex = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i > maxIndex){
                // if current index greater than maxIndex that means we cannot reach end
                // This counts the case for 0
                return false;
            }
            maxIndex = Math.max(maxIndex,i+nums[i]);
        }
        return true;
    }
}
