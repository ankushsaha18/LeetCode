public class FindInMountainArray1095 {
    // Here Mountain Araay is the API so it will not run in main function
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int ans = -1;
        ans = binarySearchAsc(mountainArr, target, 0, peakIndexInMountainArray(mountainArr));
        if (ans == -1) {
            ans = binarySearchDesc(mountainArr, target, peakIndexInMountainArray(mountainArr) + 1,
                    mountainArr.length() - 1);
        }
        return ans;

    }

    public int peakIndexInMountainArray(MountainArray arr) {
        int i = 0, j = (arr.length() - 1);
        while (i < j) {
            int m = (i + j) / 2;
            if (m + 1 < arr.length() && arr.get(m) > arr.get(m + 1)) {
                j = m;
            } else {
                i = m + 1;
            }
        }
        return j;
    }

    public int binarySearchAsc(MountainArray arr, int target, int i, int j) {
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

    public int binarySearchDesc(MountainArray arr, int target, int i, int j) {
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
