package Advanced.MonotonicStack;
import java.util.Arrays;

public class NextGreaterII503 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] st = new int[n+n+1];
        int top = 0;
        // Store the elements from last except the last as it is -1 or first values
        for(int i = n-2 ; i >= 0 ; i--){
            st[top++] = nums[i];
        }
        for(int i = n-1 ; i >= 0 ; i--){
            while (top != 0 && nums[i] >= st[top-1]){
                top--;
            }
            if(top == 0){
                ans[i] = -1;
            }else{
                ans[i] = st[top-1];
            }
            // This adds the current value to the stack(array)
            st[top++] = nums[i];
        }
        return ans;

    }
}
