package Advanced.UnionFind;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfEnclaves1020 {
    public int[] delrow = {-1,0,1,0};
    public int[] delcol = {0,-1,0,1};
    public int numEnclaves(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if((i==0 || j==0 || i==n-1 || j==m-1) && grid[i][j] == 1){
                    visited[i][j] = true;
                    q.add(new int[]{i,j});
                }
            }
        }
        bfs(grid,visited,q);
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int[][] grid,boolean[][] visited,Queue<int[]> q){
        int n = grid.length;
        int m = grid[0].length;
        while (!q.isEmpty()){
            int[] cell = q.poll();
            for (int i = 0 ; i < 4 ; i++){
                int nrow = cell[0] + delrow[i];
                int ncol = cell[1] + delcol[i];
                if(isValid(nrow,ncol,n,m) && grid[nrow][ncol] == 1 && !visited[nrow][ncol]){
                    visited[nrow][ncol] = true;
                    q.add(new int[]{nrow,ncol});
                }
            }
        }
    }
    public boolean isValid(int i,int j,int n,int m){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}
