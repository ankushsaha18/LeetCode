package Advanced.BackTracking;
import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
    public static List<String> generateParenthesis(int n) {
        n = 2*n;
        List<String> ans = new ArrayList<>();
        function(0,n,"",ans,0,0);
        return ans;
    }
    public static void function(int index,int n,String s,List<String> ans,int open,int close){
        if(index == n){ // If reached end check if opening closing equal and then add
            if(open == close){
                ans.add(s);
            }
            return;
        }
        if(close > open){
            return;
        }
        function(index+1,n, s+"(",ans,open+1,close); // Increase opening parenthesis
        function(index+1,n,s+")",ans,open,close+1); // Increase closing parenthesis
    }
}
