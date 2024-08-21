package Fundamental.TwoPointer;

import java.util.Arrays;

public class MoveZerosToEnd283 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,58,0,6,3,0,8};
        System.out.println(Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int j = -1;
        for(int k = 0 ; k < nums.length ; k++){
            if(nums[k] == 0){
                j = k;
                break;
            }
        }
        if(j == -1){
            return;
        }
        for(int i = j+1 ; i < nums.length ; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
