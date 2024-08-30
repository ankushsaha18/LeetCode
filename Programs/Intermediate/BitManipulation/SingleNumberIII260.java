package Intermediate.BitManipulation;
import java.util.Arrays;

public class SingleNumberIII260 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 2};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }
    public static int[] singleNumber(int[] nums) {
        long xor = 0;
        // find xor of all elements
        for(int i : nums){
            xor ^= i;
        }
        // This gives the rightmost set bit
        // This bit is the first bit from right which is different in the two numbers
        long rightMost = xor&(xor-1)^xor;
        // b1 stores those numbers which have 0 at that bit
        // b2 stores those which have 1 at that bit
        int b1 = 0;
        int b2 = 0;
        // Now by this we get the two numbers
        for(int i : nums){
            if((i&rightMost) == 0){
                b1 ^= i;
            }else{
                b2 ^= i;
            }
        }
        return new int[]{b1,b2};
    }
}
