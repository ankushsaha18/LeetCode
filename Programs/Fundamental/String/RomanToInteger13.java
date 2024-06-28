package Fundamental.String;

public class RomanToInteger13 {
    public static void main(String[] args) {
        String s = "VII";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int ans = 0;
        int prev = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char a = s.charAt(i);
            if(a == 'I'){
                prev = 1;
                ans++;
            }
            else if(a == 'V'){
                ans += (prev == 1)?3:5;
                prev = 5;
            }
            else if(a == 'X'){
                ans += (prev == 1)?8:10;
                prev = 10;
            }
            else if(a == 'L'){
                ans += (prev == 10)?30:50;
                prev = 50;
            }
            else if(a == 'C'){
                ans += (prev == 10)?80:100;
                prev = 100;
            }
            else if(a == 'D'){
                ans += (prev == 100)?300:500;
                prev = 500;
            }
            else if(a == 'M'){
                ans += (prev == 100)?800:1000;
                prev = 1000;
            }
        }
        return ans;
    }
}
