import java.util.Arrays;

public class setMismatch645 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4 };
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        cycleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans[0] = nums[i];
                ans[1] = i + 1;
                break;
            }
        }
        return ans;
    }

    public static void cycleSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] == arr[correct]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
    }
}
