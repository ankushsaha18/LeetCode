package Fundamental.Simulation;
import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] number = { 1, 5, 7, 8, 1, 4 };
        int[] index = { 0, 1, 2, 1, 2, 4 };
        System.out.println(Arrays.toString(createTargetArray(number, index)));
    }
}
