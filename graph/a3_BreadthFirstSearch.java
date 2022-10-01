package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @Sir Darey
 */

public class a3_BreadthFirstSearch {
    
    private final LinkedList<Integer> [] adj;
    private final int V;
    private int E;
    
    public a3_BreadthFirstSearch(int nodes) {
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
    
    public void bfs (int start) {
        boolean[] visited = new boolean[V];
        Queue <Integer> q = new LinkedList<>();
        
        q.offer(start);
        visited[start] = true;
        
        while(!q.isEmpty()) {
            int i = q.poll();
            System.out.print(i +" ");
            
            for (int u : adj[i]) {
                if (!visited[u]) {
                    q.offer(u);
                    visited[u] = true;
                }
            }           
        }
    }
    
    public static void main(String[] args) {
        a3_BreadthFirstSearch create = new a3_BreadthFirstSearch(5);
        
        create.addEdge(0, 1);
        create.addEdge(1, 2);
        create.addEdge(2, 3);
        create.addEdge(3, 0);
        create.addEdge(2, 4);
        
        System.out.println(create);
        
        System.out.println("Performing A Breadth First Search (BFS)"
                + "(Also Known as Level Order Traversal of a Graph)...\n");
        create.bfs(0);
    }
    
}
