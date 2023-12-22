import java.util.Arrays;

public class ArrasyShuffle1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int k = 0, j = n, temp = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (temp == 0) {
                res[i] = nums[k];
                k++;
                temp = 1;
            } else {
                res[i] = nums[j];
                j++;
                temp = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(shuffle(nums, nums.length / 2)));
    }
}
