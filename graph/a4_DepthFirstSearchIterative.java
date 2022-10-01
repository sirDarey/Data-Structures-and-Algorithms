package graph;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @Sir Darey
 */

public class a4_DepthFirstSearchIterative {
    
    private final LinkedList<Integer> [] adj;
    private final int V;
    private int E;
    
    public a4_DepthFirstSearchIterative(int nodes) {
        adj = new LinkedList [nodes];
        V = nodes;
        E = 0;
        
        for (int i=0; i<V; i++) {
            adj[i] = new LinkedList<>();
        }
    }
    
    public void addEdge (int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(V).append(" Vertices, ").append(E).append(" Edges\n");
        
        for (int v=0; v<V; v++) {
            sb.append(v).append(":  ");
            for (int u : adj[v]) {
                sb.append(u).append(" ");
            }
            sb.append("\n");
        }
        
        return sb.toString();
    }
    
    public void dfs (int start) {
        boolean[] visited = new boolean[V];
        Stack <Integer> stack = new Stack<>();
        
        stack.push(start);
        
        while(!stack.isEmpty()) {
            int i = stack.pop();
            if (!visited[i]){
                System.out.print(i +" ");
                visited[i] = true;
                
                for (int u : adj[i]) {
                    if (!visited[u]) {
                        stack.push(u);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        a4_DepthFirstSearchIterative create = new a4_DepthFirstSearchIterative(5);
        
        create.addEdge(0, 1);
        create.addEdge(1, 2);
        create.addEdge(2, 3);
        create.addEdge(3, 0);
        create.addEdge(2, 4);
        
        System.out.println(create);
        
        System.out.println("Performing An Iterative Depth First Search (DFS)...\n");
        create.dfs(0);
    }
    
}
