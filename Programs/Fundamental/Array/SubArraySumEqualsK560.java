package Fundamental.Array;

import java.util.HashMap;

public class SubArraySumEqualsK560 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subarraySum(nums,3));
    }
    public static int subarraySum(int[] nums, int k) {
        // To store the sum at every index
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        // sum of 0 is always present
        map.put(0,1);
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            // Increase the count of the sum
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
