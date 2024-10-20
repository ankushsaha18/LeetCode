package Advanced.Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CompleteComponent2685 {
    public int countCompleteComponents(int n, int[][] edges) {
        int cnt = 0;
        int[] visited = new int[n];
        List<Integer>[] adj = new ArrayList[n];
        for(int i = 0 ; i < n ; i++){
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }
        for(int i = 0 ; i < n ; i++){
            if(visited[i] != 1){
                bfs(i,adj,visited);
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
