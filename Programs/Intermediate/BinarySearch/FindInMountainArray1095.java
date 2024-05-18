package Intermediate.BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

public class FindInMountainArray1095 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,4,5,6,3,1));
        int target = 4;
        System.out.println(findInMountainArray(target,arr));
    }
    /* In Original question a API named MountainArray is used but now as we cant use it here,so we have used
       ArrayList here in original question where we use MountainArray API we will change the functions
       accordingly
    */
    // Here Mountain Array is the API ,so it will not run in main function
    public static int findInMountainArray(int target, ArrayList<Integer> mountainArr) {
        int ans = -1;
        ans = binarySearchAsc(mountainArr, target, 0, peakIndexInMountainArray(mountainArr));
        if (ans == -1) {
            ans = binarySearchDesc(mountainArr, target, peakIndexInMountainArray(mountainArr) + 1,
                    mountainArr.size() - 1);
        }
        return ans;

    }
    public static int peakIndexInMountainArray(ArrayList<Integer> arr) {
        int i = 0, j = (arr.size() - 1);
        while (i < j) {
            int m = (i + j) / 2;
            if (m + 1 < arr.size() && arr.get(m) > arr.get(m+1)){
                j = m;
            } else {
                i = m + 1;
            }
        }
        return j;
    }
    public static int binarySearchAsc(ArrayList<Integer> arr, int target, int i, int j) {
        while (i < j) {
            int m = (i + j) / 2;
            if (target > arr.get(m)) {
                i = m + 1;
            } else {
                j = m;
            }
        }
        if (arr.get(i) != target) {
            return -1;
        }
        return i;
    }
    public static int binarySearchDesc(ArrayList<Integer> arr, int target, int i, int j) {
        while (i < j) {
            int m = (i + j) / 2;
            if (target > arr.get(m)) {
                j = m;
            } else if (target < arr.get(m)) {
                i = m + 1;
            } else {
                return m;
            }
        }
        if (arr.get(i) != target) {
            return -1;
        }
        return i;
    }
}
