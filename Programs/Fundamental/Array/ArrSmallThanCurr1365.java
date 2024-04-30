package Fundamental.Array;
import java.util.Arrays;

public class ArrSmallThanCurr1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        int count[] = new int[102];
        for (int n : nums) { // to count the occurence
            count[n]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1]; // here we are adding previous lesser numbers
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) { // if conditions as for 0 index will become -1
                ans[i] = 0;
            } else {
                ans[i] = count[nums[i] - 1]; // -1 as we have to calculate lesser values not less andf equal
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 4, 5, 99, 1, 55, 52 };
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
}
