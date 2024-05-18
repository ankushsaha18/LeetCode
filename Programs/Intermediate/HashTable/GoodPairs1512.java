package Intermediate.HashTable;

public class GoodPairs1512 {
    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res += 1;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 4, 1, 5, 5, 2 };
        System.out.println(numIdenticalPairs(nums));
    }
}
