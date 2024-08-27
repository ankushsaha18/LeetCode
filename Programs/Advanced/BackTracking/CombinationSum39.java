package Advanced.BackTracking;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 5, 4};
        System.out.println(combinationSum(candidates,7));
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        function(ans,temp,0,target,candidates);
        return ans;
    }
    public static void function(List<List<Integer>> ans,List<Integer> temp,int index,int target,int[] candidates){
        if(target < 0 || index == candidates.length){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(candidates[index] <= target){
            temp.add(candidates[index]);
            function(ans,temp,index,target-candidates[index],candidates);
            temp.remove(temp.size()-1);
        }
        function(ans,temp,index+1,target,candidates);
    }
}
