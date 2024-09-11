package Intermediate.Greedy;
import java.util.Arrays;

public class AssignCookies455 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s ={1,1};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int l = 0;
        int r = 0;
        while (l < g.length && r < s.length){
            if(s[r] >= g[l]){
                l++;
            }
            r++;
        }
        return l;
    }
}
