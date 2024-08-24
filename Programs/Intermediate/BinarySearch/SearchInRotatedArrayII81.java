package Intermediate.BinarySearch;

public class SearchInRotatedArrayII81 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        System.out.println(search(arr,0));
    }
    public static boolean search(int[] nums, int target) {
        int low = 0 , high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            }
            // Handle for duplicates
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
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
        return false;
    }
}
