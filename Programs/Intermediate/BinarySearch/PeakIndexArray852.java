package Intermediate.BinarySearch;
import java.util.ArrayList;

public class PeakIndexArray852 {
    public static void main(String[] args) {
        int arr[] = { 0, 10, 51, 2 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int i = 0, j = (arr.length - 1);
        while (i < j) {
            int m = (i + j) / 2;
            if (m + 1 < arr.length && arr[m] > arr[m + 1]) {
                j = m;
            } else {
                i = m + 1;
            }
        }
        return j;
    }
}
