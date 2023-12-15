import java.util.ArrayList;
import java.util.List;

public class KidCandy1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }
        List<Boolean> res = new ArrayList<Boolean>(candies.length);
        for (int i = 0, l = candies.length; i < l; i++)
            res.add((candies[i] + extraCandies) >= max);
        return res;

    }

    public static void main(String[] args) {
        int candies[] = { 5, 4, 3, 2, 1, 8, 4 };
        int extra = 2;
        System.out.println(kidsWithCandies(candies, extra));
    }
}
