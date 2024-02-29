public class RemoveParenthesis1021 {
    public static void main(String[] args) {
        String s = "(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && open++ > 0) {
                ans.append(c);
            }
            if (c == ')' && open-- > 1) {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
