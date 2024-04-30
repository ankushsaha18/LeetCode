public class MatrixDiagonalSum1572 {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - 1 - i];
        }
        for (int i = mat.length - 1; i > n; i--) {
            sum += mat[i][i];
            sum += mat[i][mat.length - 1 - i];
        }
        if (mat.length % 2 != 0) {
            sum += mat[n][n];
        } else {
            sum += mat[n][n - 1];
            sum += mat[n][n];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        System.out.println(diagonalSum(matrix));
    }
}
