public class EvenDigit1295 {
    public static int findNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res += (numberOfDigits(num) % 2 == 0) ? 1 : 0;
        }
        return res;
    }

    public static int numberOfDigits(int num) {
        int res = 0;
        while (num > 0) {
            res++;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 588, 458, 5881 };
        System.out.println(findNumbers(arr));
    }
}
