package Intermediate.Math;

public class OddValMatrix1252 {
    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int ans[][] = new int[m][n];
        for (int[] i : indices) {
            for (int j = 0; j < m; j++) {
                ans[j][i[1]]++;
            }
            int temp = ans[i[0]].length;
            for (int k = 0; k < temp; k++) {
                ans[i[0]][k]++;
            }
        }
        for (int[] i : ans) {
            for (int j : i) {
                if (j % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] indices = { { 0, 1 }, { 1, 1 } };
        System.out.println(oddCells(2, 3, indices));
    }
}
