package Array;

public class FirstPosMiss41usingBarr {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 7 };
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        boolean b[] = new boolean[nums.length];
        for (int i : nums) {
            if (i > 0 && i <= nums.length) {
                b[i - 1] = true;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) {
                return i + 1;
            }
        }
        return b.length + 1;
    }
}
