package Fundamental.Array;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence128 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int ans = 1;
        Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }
        for (int num : st) {
            // To check if it's the starting element of the sequence
            if(!st.contains(num-1)){
                int cnt = 1;
                int x = num;
                while (st.contains(x+1)){
                    cnt++;
                    x++;
                }
                ans = Math.max(ans,cnt);
            }
        }
        return ans;
    }
}
