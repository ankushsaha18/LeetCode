package Fundamental.Sorting;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(anagramStrings(s,t));
    }
    public static boolean anagramStrings(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            s1[s.charAt(i) - 'a']++;
            t1[t.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(s1[i] != t1[i]){
                return false;
            }
        }
        return true;
    }
}
