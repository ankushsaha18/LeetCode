package Intermediate.BinarySearch;

public class SearchInRotatedArray33 {
    // Google Question
    public static void main(String[] args) {
        int[] arr = { 2, 9, 2, 2 };
        System.out.println(search(arr, 2));
    }

    public static int search(int[] nums, int target) {
        int low = 0 , high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[low] <= nums[mid]){  // To check which half is sorted left or right
                if(target >= nums[low] && target <= nums[mid]){  // To check if target lies in the range of sorted part
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(target >= nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
