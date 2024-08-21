package Intermediate.BinarySearch;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr,7));
    }
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int m = left + (right - left)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] > target){
                right = m - 1;
            }else{
                left = m + 1;
            }
        }
        return left;
    }
}
