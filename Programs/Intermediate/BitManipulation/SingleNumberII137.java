package Intermediate.BitManipulation;

public class SingleNumberII137 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for(int i : nums){
            // add to ones if not in 2
            // if in already in ones then value becomes 0 due to ^
            ones = (ones^i) & ~twos;
            // add to twos if not in ones
            twos = (twos^i) & ~ones;
        }
        return ones;
    }
}
