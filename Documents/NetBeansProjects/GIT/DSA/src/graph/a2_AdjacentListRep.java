package graph;

import java.util.LinkedList;

/**
 *
 * @Sir Darey
 */
public class a2_AdjacentListRep {
    
    private LinkedList<Integer> [] adj;
    private int V, E;
    
    public a2_AdjacentListRep(int nodes) {
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
    
    
    
    public static void main(String[] args) {
        a2_AdjacentListRep create = new a2_AdjacentListRep(4);
        
        create.addEdge(0, 1);
        create.addEdge(1, 2);
        create.addEdge(2, 3);
        create.addEdge(3, 0);
        
        System.out.println(create);
    }
    
}
