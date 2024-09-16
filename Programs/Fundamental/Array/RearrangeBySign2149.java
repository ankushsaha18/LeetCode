package Fundamental.Array;

import java.util.Arrays;

public class RearrangeBySign2149 {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 1;
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(num < 0){
                ans[n] = num;
                n += 2;
            }else{
                ans[p] = num;
                p += 2;
            }
        }
        return ans;
    }
}
