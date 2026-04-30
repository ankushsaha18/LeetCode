package Advanced.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class CloneGraph133 {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        return dfs(node,new HashMap<>());

    }
    public Node dfs(Node node,HashMap<Integer,Node> visited){
        if(visited.containsKey(node.val)) return visited.get(node.val);

        Node current = new Node(node.val);
        visited.put(node.val,current);

        for(Node neighbor : node.neighbors){
            current.neighbors.add(dfs(neighbor,visited));
        }
        return current;
    }
}


class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}