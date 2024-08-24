package Intermediate.BinarySearch;

public class FindMinSortedArray153 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,1,2,3};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int left  = 0 , right = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while (left <= right){
            int mid = left + (right - left)/2;
            // Compare with the smallest value of sorted half and eliminate that half and search in other half
            if(nums[left] <= nums[mid]){
                if(nums[left] < ans){
                    ans = nums[left];
                }
                left = mid + 1;
            }else{
                if(nums[mid] < ans){
                    ans = nums[mid];
                }
                right = mid - 1;
            }
        }
        return ans;
    }
}
