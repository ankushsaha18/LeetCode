package Advanced.UnionFind;
import java.util.LinkedList;
import java.util.Queue;

public class NumberIsland200 {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    cnt++;
                    bfs(i, j, grid, visited);
                }
            }
        }
        return cnt;
    }

    public void bfs(int a, int b, char[][] grid, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a, b});
        visited[a][b] = true;
        int n = grid.length;
        int m = grid[0].length;

        // Define directions for up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0];
            int column = cell[1];

            for (int[] dir : directions) {
                int nr = row + dir[0];
                int nc = column + dir[1];

                if (isValid(nr, nc, n, m) && !visited[nr][nc] && grid[nr][nc] == '1') {
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
            }
        }
    }

    public boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
