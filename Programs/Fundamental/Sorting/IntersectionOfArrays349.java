package Fundamental.Sorting;
import java.util.Arrays;

public class IntersectionOfArrays349 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersectionArray(nums1,nums2)));
    }
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        boolean[] boolCount = new boolean[1001];
        int[] count = new int[1001];
        int index = 0;
        for(int i : nums1){
            boolCount[i] = true;
        }
        for(int i : nums2){
            if(boolCount[i]){
                count[index++] = i;
                boolCount[i] = false;
            }
        }
        int[] ans = new int[index];
        for(int i = 0 ; i < index ; i++){
            ans[i] = count[i];
        }
        return ans;
    }
}
