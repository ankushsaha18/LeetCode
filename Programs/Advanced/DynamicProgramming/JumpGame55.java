package Advanced.DynamicProgramming;

public class JumpGame55 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
        int n = nums.length - 1;
        int coverage = 0;
        int lastIndex = 0;
        for(int i = 0 ; i < n ; i++){
            coverage = Math.max(coverage,i + nums[i]);   // To check all the elements of that window
            if(i == lastIndex){
                lastIndex = coverage;
                if(lastIndex >= n){
                    return true;
                }
            }
        }
        return false;
    }
}
