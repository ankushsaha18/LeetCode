package Advanced.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII40 {
    public static void main(String[] args) {
        int[] candidates = {2, 1, 2, 7, 6, 1, 5};
        System.out.println(combinationSum2(candidates,8));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        function(ans,temp,0,target,candidates);
        return ans;
    }
    public static void function(List<List<Integer>> ans,List<Integer> temp,int index,int target,int[] candidates) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        if (target < 0 || index == candidates.length) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            // The idea is to pick one and skip to the different one
            // This will skip all the index with same values
            // i>index as we don't want repeatation after it
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            temp.add(candidates[i]);
            function(ans, temp, i + 1, target - candidates[i], candidates);
            temp.remove(temp.size() - 1);
        }
    }
}
