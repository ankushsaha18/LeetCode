package Fundamental.Array;

public class RotateImage48 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        for(int[] row : matrix){
            for(int item : row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Transpose of Matrix
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                // swap diagonal elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for(int[] row : matrix){
            for(int j = 0 ; j < m/2 ; j++){
                int temp = row[j];
                row[j] = row[m-j-1];
                row[m-j-1] = temp;
            }
        }
    }
}
