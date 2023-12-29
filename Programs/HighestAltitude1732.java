public class HighestAltitude1732 {
    public static int largestAltitude(int[] gain) {
        int[] alt = new int[gain.length + 1];
        alt[0] = 0;
        int ans = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 1; i < alt.length; i++) {
            temp += gain[i - 1];
            alt[i] = temp;
        }
        for (int i : alt) {
            if (i > ans) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println(largestAltitude(gain));
    }
}
