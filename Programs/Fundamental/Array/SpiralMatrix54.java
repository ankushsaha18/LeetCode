package Fundamental.Array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4 ,5 ,6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int top = 0;
        int right = matrix[0].length-1;
        int down = matrix.length-1;
        while (left <= right && top <= down){
            for(int i = left ; i <= right ; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i = top ; i <= down ; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= down){
                for(int i = right ; i >= left ; i--){
                    ans.add(matrix[down][i]);
                }
                down--;
            }
            if(left <= right){
                for(int i = down ; i >= top ; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
