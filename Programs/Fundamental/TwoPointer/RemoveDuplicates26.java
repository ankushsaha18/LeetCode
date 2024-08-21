package Fundamental.TwoPointer;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1 ; j < nums.length ; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
