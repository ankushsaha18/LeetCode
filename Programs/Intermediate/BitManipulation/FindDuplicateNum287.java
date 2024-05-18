package Intermediate.BitManipulation;

public class FindDuplicateNum287 {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        boolean b[] = new boolean[nums.length];
        for (int n : nums) {
            if (b[n] == false) {
                b[n] = true;
            } else {
                return n;
            }
        }
        return 0;
    }
}
