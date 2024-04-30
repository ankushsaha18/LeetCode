public class RichCustWltg1672 {
    public static int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] a : accounts) {
            int temp = 0;
            for (int bac : a) {
                temp += bac;
            }
            if (temp > res) {
                res = temp;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 1, 2, 3 }, { 1, 6 } };
        System.out.println(maximumWealth(arr));
    }
}
