public class RainWaterTrapping42 {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        int ans = 0;
        int[] leftMaxBound = new int[height.length];
        int[] rightMaxBound = new int[height.length];
        int max = height[0];
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            leftMaxBound[i] = max;
        }
        max = height[height.length - 1];
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rightMaxBound[i] = max;
        }
        for (int i = 0; i < height.length; i++) {
            int temp = Math.min(leftMaxBound[i], rightMaxBound[i]);
            temp -= height[i];
            if (temp > 0) {
                ans += temp;
            }
        }
        return ans;
    }
}
