import java.util.ArrayList;
import java.util.List;

public class NumberDisappeared448 {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                ans.add(i + 1);
            }
        }
        return ans;
    }

    public static void cycleSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] <= arr.length && arr[i] == arr[correct]) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
    }
}
