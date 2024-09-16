package Fundamental.Array;
import java.util.Arrays;

public class ReplaceElementWithRight1299 {
    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        int[] ans = new int[n];
        for(int i = n-1 ; i >= 0 ; i--){
            ans[i] = max;
            max = Math.max(max,arr[i]);
        }
        return ans;
    }
}
