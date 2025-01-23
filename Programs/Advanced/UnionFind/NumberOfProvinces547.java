package Advanced.UnionFind;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumberOfProvinces547 {
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        List<Integer>[] adjl = new ArrayList[V];
        for(int i = 0 ; i < V ; i++){
            adjl[i] = new ArrayList<>();
        }
        // convert matrix to list
        for(int i = 0 ; i < V ; i++){
            for(int j = 0 ; j < V ; j++){
                if(isConnected[i][j] == 1){
                    adjl[i].add(i);
                    adjl[j].add(i);
                }
            }
        }
        int cnt = 0;
        int[] visited = new int[V+1];
        // visit every node and if not visited perform bfs and increase counter
        for(int i = 0 ; i < V ; i++){
            if(visited[i] == 0){
                bfs(i,adjl,visited);
                cnt++;
            }
        }
        return cnt;
    }
    public List<Integer> bfs(int node, List<Integer>[] adj,int[] visited) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 1;
        while (!q.isEmpty()){
            int f = q.poll();
            for(int i : adj[f]){
                if(visited[i] != 1){
                    q.add(i);
                    visited[i] = 1;
                }
            }
            ans.add(f);
        }
        return ans;
    }
}
