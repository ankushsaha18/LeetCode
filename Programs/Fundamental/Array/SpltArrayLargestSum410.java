public class SpltArrayLargestSum410 {
    public static void main(String[] args) {
        int arr[] = { 7, 5, 2, 8, 10 };
        System.out.println(splitArray(arr, 2));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for (int i : nums) {
            start = Math.max(start, i);
            end += i;
        }
        while (start < end) {
            int mid = (start + end) / 2;
            int sum = 0, parts = 1;
            for (int i : nums) {
                if (sum + i > mid) {
                    sum = i;
                    parts++;
                } else {
                    sum += i;
                }
            }
            if (parts > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
