package Intermediate.Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval57 {
    public static void main(String[] args) {
        int[][] intervals = { {1, 3} , {6, 9}};
        int[] newInterval = {2,5};
        System.out.println(Arrays.deepToString(insertNewInterval(intervals,newInterval)));
    }
    public static int[][] insertNewInterval(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        // Add the intervals to answer before the new interval
        while (i < n && intervals[i][1] < newInterval[0]){
            list.add(intervals[i]);
            i++;
        }
        // Merge the intervals which are overlapping with the new Interval
        // compare the start time and end time of new interval
        while (i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        list.add(newInterval);
        // add the rest to answer
        while (i < n){
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
