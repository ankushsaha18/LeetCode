import java.util.*;

public class medianArray4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int[] z = new int[a + b];
        System.arraycopy(nums1, 0, z, 0, a);
        System.arraycopy(nums2, 0, z, a, b);
        Arrays.sort(z);
        int d = z.length;
        int e = d / 2;
        if (d % 2 == 0) {
            double res = (double) (z[e] + z[e - 1]) / 2;
            return res;
        } else {
            double res = (double) z[e];
            return res;
        }
    }

    public static void main(String[] args) {
        int[] a = { 101, 200, 305, 4 };
        int[] b = { 5, 6 };
        System.out.println(findMedianSortedArrays(a, b));
    }
}
