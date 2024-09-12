package Intermediate.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingInterval435 {
    public static void main(String[] args) {
        int[][] interval = {{1, 2} , {2, 3} , {3, 4} ,{1, 3} };
        System.out.println(eraseOverlapIntervals(interval));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        int rem = 0;
        int cet = Integer.MIN_VALUE;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });
        for (int[] interval : intervals) {
            if (interval[0] >= cet) {
                cet = interval[1];
            } else {
                rem++;
            }
        }
        return rem;
    }
}
