import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicate442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        boolean b[] = new boolean[nums.length];
        for (int n : nums) {
            if (b[n-1] == false) {
                b[n-1] = true;
            } else {
                ans.add(n);
            }
        }
        return ans;
    }
}
