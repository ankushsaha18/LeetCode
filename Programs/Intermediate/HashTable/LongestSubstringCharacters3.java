package Intermediate.HashTable;

import java.util.Arrays;

public class LongestSubstringCharacters3 {
    public static void main(String[] args) {
        String s = "aaaaaaa";
        System.out.println(longestNonRepeatingSubstring(s));
    }
    public static int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int l = 0;
        int r = 0;
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        while (r < n){
            if(hash[s.charAt(r)] != -1){
                // move pointer to rightmost place of occurrence of the element
                l = Math.max(l,hash[s.charAt(r)]+1);
            }
            // set ans as maximum length
            ans = Math.max(r-l+1,ans);
            // store the index of character at hash array
            // increment the r pointer
            hash[s.charAt(r)] = r++;
        }
        return ans;
    }
}
