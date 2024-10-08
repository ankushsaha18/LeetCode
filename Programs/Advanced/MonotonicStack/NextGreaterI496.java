package Advanced.MonotonicStack;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterI496 {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] position = new int[10001];
        for(int i = 0 ; i < nums2.length ; i++){
            position[nums2[i]] = i;
        }
        int[] ans = new int[nums1.length];
        for(int i = 0 ; i < nums1.length ; i++){
            int index = position[nums1[i]];
            ans[i] = -1;
            for(int j = index ; j < nums2.length ; j++){
                if(nums2[j] > nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}
