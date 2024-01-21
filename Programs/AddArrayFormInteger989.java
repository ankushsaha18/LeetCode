import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddArrayFormInteger989 {
    public static void main(String[] args) {
        int[] num = { 7 };
        System.out.println(addToArrayForm(num, 993));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = num.length - 1; i >= 0 || k > 0; i--) {
            if (i >= 0) {
                list.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
            } else {
                list.add(k % 10);
                k /= 10;
            }
        }
        Collections.reverse(list);
        return list;

    }
}
