package Fundamental.Sorting;

public class MissingNumber268 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 5, 6, 7, 8 };
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int temp = nums.length * (nums.length + 1) / 2;
        for (int i : nums) {
            temp -= i;
        }
        return temp;
    }
}
