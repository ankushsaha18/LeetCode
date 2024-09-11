package Fundamental.String;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(isValid("{[()]}"));
    }
    public static boolean isValid(String s) {
        if (s.length()%2 != 0) {
            return false;
        }
        Stack<Character> s1 = new Stack<>();
        int open = 0;
        int close = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(close > open){
                return false;
            }
            if(ch == '(' || ch == '{' || ch == '['){
                s1.push(ch);
                open++;
            }else {
                if(s1.isEmpty()){
                    return false;
                }
                if(ch == ')' && s1.peek() != '('){
                    return false;
                }
                if(ch == '}' && s1.peek() != '{'){
                    return false;
                }
                if(ch == ']' && s1.peek() != '['){
                    return false;
                }
                s1.pop();
                close++;
            }
        }
        if(open == close){
            return true;
        }
        return false;
    }
}
