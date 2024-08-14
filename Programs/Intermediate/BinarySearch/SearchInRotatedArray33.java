package Intermediate.BinarySearch;

public class SearchInRotatedArray33 {
    // Google Question
    public static void main(String[] args) {
        int[] arr = { 2, 9, 2, 2 };
        System.out.println(search(arr, 2));
    }

    public static int search(int[] nums, int target) {
        int point = pivt(nums);
        int ans = binarySearch(nums, target, 0, point);
        if (ans == -1 && point + 1 < nums.length) {
            ans = binarySearch(nums, target, point + 1, nums.length - 1);
        }
        return ans;
    }

    public static int pivt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return arr[0];
    }

    public static int binarySearch(int arr[], int target, int i, int j) {
        while (i < j) {
            int m = (i + j) / 2;
            if (target > arr[m]) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        if (i < arr.length && arr[i] == target) {
            return i;
        }

        return -1;
    }
}
