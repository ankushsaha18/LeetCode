package Intermediate.SlidingWindow;

public class MaxPointsCards1423 {
    public static void main(String[] args) {
        int[] arr = {9, 10, 1, 2, 3, 5};
        System.out.println(maxScore(arr,5));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int ans = 0;
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0 ; i < k ; i++){
            leftSum += cardPoints[i];
        }
        ans = leftSum;
        int right = cardPoints.length-1;
        for(int i = k-1 ; i >= 0 ; i--){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[right--];
            ans = Math.max(ans,leftSum+rightSum);
        }
        return ans;
    }
}
