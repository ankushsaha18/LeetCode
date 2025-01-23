package Advanced.Graph;
import java.util.Arrays;

public class FloodFill733 {
    int[] rowVisit = {-1,0,1,0};
    int[] colVisit = {0,1,0,-1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0 ; i < n ; i++){
            ans[i] = Arrays.copyOf(image[i],m);
        }
        int inColor = image[sr][sc];
        dfs(sr,sc,ans,image,inColor,color);
        return ans;
    }
    public void dfs(int row,int col,int[][] ans,int[][] image,int inColor,int newColor){
        ans[row][col] = newColor;
        for(int i = 0 ; i < 4 ; i++){
            int nrow = row + rowVisit[i];
            int ncol = col + colVisit[i];
            if(isValid(nrow,ncol, image.length, image[0].length) && image[nrow][ncol] == inColor && ans[nrow][ncol] != newColor){
                dfs(nrow,ncol,ans,image,inColor,newColor);
            }
        }
    }
    public boolean isValid(int i,int j,int n,int m){
        if(i < 0 || i >= n){
            return false;
        }
        else if(j < 0 || j >= m){
            return false;
        }
        return true;
    }
}
