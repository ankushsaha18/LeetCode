package Intermediate.BinarySearch;

public class BinarySearch704 {
    public static void main(String[] args) {
        int[] arr = {2,3,8,9,19,75,100};
        System.out.println(search(arr,75));
    }
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start<= end)
        {
            int mid = start + (end - start)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            if(nums[mid]>target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
}
