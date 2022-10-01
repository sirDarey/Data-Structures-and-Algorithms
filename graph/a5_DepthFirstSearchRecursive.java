package graph;

import java.util.LinkedList;
/**
 *
 * @Sir Darey
 */

public class a5_DepthFirstSearchRecursive {
    
    private final LinkedList<Integer> [] adj;
    private final int V;
    private int E;
    private boolean[] visited;
    
    public a5_DepthFirstSearchRecursive(int nodes) {
        adj = new LinkedList [nodes];
        V = nodes;
        E = 0;
        visited = new boolean[nodes];
        
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
    
    public void dfs () {
        for (int v=0; v<V; v++) {
            if (!visited [v]) {
                visited[v] = true;
                System.out.print(v +" ");
            }
        } 
    }
    
    public static void main(String[] args) {
        a5_DepthFirstSearchRecursive create = new a5_DepthFirstSearchRecursive(6);
        
        create.addEdge(0, 1);
        create.addEdge(1, 2);
        create.addEdge(2, 3);
        create.addEdge(3, 0);
        create.addEdge(2, 4);
        create.addEdge(5, 5);
        
        System.out.println(create);
        
        System.out.println("Performing An Recursive Depth First Search (DFS)...\n");
        create.dfs();
    }
    
}
