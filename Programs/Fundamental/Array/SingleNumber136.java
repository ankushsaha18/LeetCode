package Fundamental.Array;

public class SingleNumber136 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 4, 1};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor ^= i;
        }
        return xor;
    }
}
