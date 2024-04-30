package Fundamental.Array;
import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNum448 {
    public static void main(String[] args) {

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] arr =new boolean[nums.length+1];
        for (int num : nums) {
            arr[num] = true;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(!arr[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}
