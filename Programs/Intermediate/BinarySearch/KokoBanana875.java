package Intermediate.BinarySearch;

public class KokoBanana875 {
    public static void main(String[] args) {
        int[] nums = {805306368,805306368,805306368};
        System.out.println(minimumRateToEatBananas(nums,1000000000));
    }
    public static int minimumRateToEatBananas(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        while (low <= high){
            int mid = low + (high - low)/2;
            long sum = calculateSum(piles,mid);
            if(sum <= h){
                // reverse signing as we are dividing
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
    private static int findMax(int[] nums){
        int max = nums[0];
        for(int num: nums){
            max = Math.max(num,max);
        }
        return max;
    }
    private static long calculateSum(int[] nums,int divisor){
        long sum = 0;
        for(int num : nums){
            sum += (num + divisor - 1)/divisor;
        }
        return sum;
    }
}
