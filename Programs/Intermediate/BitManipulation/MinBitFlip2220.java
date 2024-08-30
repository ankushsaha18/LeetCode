package Intermediate.BitManipulation;

public class MinBitFlip2220 {
    public static void main(String[] args) {
        System.out.println(minBitsFlip(10,7));
    }
    public static int minBitsFlip(int start, int goal) {
        int xor = start^goal;
        int ans = 0;
        while (xor != 0){
            ans++;
            xor = xor & (xor-1);
        }
        return ans;
    }
}
