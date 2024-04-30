package Fundamental.Array;

public class EvenDigit1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (((int) Math.log10(i) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 588, 458, 5881 };
        System.out.println(findNumbers(arr));
    }
}
