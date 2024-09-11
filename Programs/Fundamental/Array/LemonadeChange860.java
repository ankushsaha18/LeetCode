package Fundamental.Array;

public class LemonadeChange860 {
    public static void main(String[] args) {
        int[] bills = {5, 5, 10, 20};
        System.out.println(lemonadeChange(bills));
    }
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five < 1) {
                    return false;
                }
                five--;
                ten++;
            } else if (bill == 20) {
                if (ten > 1 && five > 1) {
                    ten--;
                    five--;
                } else if (five > 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
