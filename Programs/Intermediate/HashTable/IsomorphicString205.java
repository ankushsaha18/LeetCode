package Intermediate.HashTable;

public class IsomorphicString205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add","egg"));
    }
    public static boolean isIsomorphic (String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // total 256 ASCII values
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        for(int i = 0 ; i < s.length() ; i++){
            if(map1[s.charAt(i)] != map2[t.charAt(i)]){
                return false;
            }
            // +1 as to differentiate from 0
            map1[s.charAt(i)] = i+1;
            map2[t.charAt(i)] = i+1;
        }
        return true;
    }
}
