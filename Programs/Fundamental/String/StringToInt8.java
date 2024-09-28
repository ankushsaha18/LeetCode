package Fundamental.String;

public class StringToInt8 {
    public static void main(String[] args) {
        String s = "-91283472332";
        System.out.println(myAtoi(s));
    }
    public static int myAtoi(String s) {
        long ans = 0;
        int i;
        for(i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != ' '){
                break;
            }
        }
        if(i >= s.length()){
            return 0;
        }
        int sign = 1;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }
        for( ; i < s.length() ; i++){
            if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
                return (sign == 1)?Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            char c = s.charAt(i);
            if(c < 48 || c > 57){
                break;
            }
            ans = ans*10 + (c-48);
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return (sign == 1)?Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        ans *= sign;
        return (int)ans;
    }
}
