import java.util.Arrays;

public class FirstLastPosSortedArr34 {
    public static void main(String[] args) {
        int arr[] = { 1 };
        System.out.println(Arrays.toString(searchRange(arr, 1)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };
        if (nums.length == 0) {
            return ans;
        }
        int item = binarySearch(nums, target);
        if (nums[item] == target) {
            ans[0] = item;
            while (item < nums.length && target == nums[item]) {
                item++;
            }
            if (item - 1 < nums.length) {
                ans[1] = item - 1;
            }
        }
        return ans;
    }

    public static int binarySearch(int[] arr, int target) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int m = (i + j) / 2;
            if (target > arr[m]) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        return i;
    }
}
