package graph;

import java.util.LinkedList;

/**
 *
 * @Sir Darey
 */

public class a6_ConnectedComponents {
    
    private LinkedList<Integer> [] adj;
    private final int V;
    private int E;
    private final boolean[] visited;
    private final int [] compId;
    private int count;
    
    public a6_ConnectedComponents(int nodes) {
        adj = new LinkedList [nodes];
        V = nodes;
        E = 0;
        visited = new boolean[nodes];
        compId = new int [nodes];
        count = 0;
        
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

                dfs();
            }
        } 
    }
    
    public void connectedComp (boolean [] visited, LinkedList<Integer> [] adj) {
        for (int v=0; v<V; v++) {
            if (!visited[v]) {
                recur (v, visited, adj);                
                count++;
            }            
        }
    }   
    
    public void recur (int v, boolean [] visited, LinkedList<Integer> [] adj) {
        visited[v] = true;
        compId[v] = count;

        for (int u : adj[v]) {
            if (!visited[u])
                recur(u, visited, adj);
        }
    }
    
    public static void main(String[] args) {
        a6_ConnectedComponents create = new a6_ConnectedComponents(6);
        
        create.addEdge(0, 1);
        create.addEdge(3, 0);
        create.addEdge(2, 4);
        create.addEdge(5, 5);
        
        System.out.println(create);
        
        System.out.println("Performing An Recursive Depth First Search (DFS)...");
        create.dfs();
        
        System.out.println("\n\nDetermining the Connected Components...");
        
        //Creating a new object to Access the Connected Components
        a6_ConnectedComponents count = new a6_ConnectedComponents(6);
        count.adj = create.adj; //Assigning the already created Linked List to this NEW Object "count"
        
        count.connectedComp(count.visited, count.adj);
        for (int i : count.compId){
            System.out.print(i +" ");
        }
        
        System.out.println("\nThe Connected Components are: " +count.count);
        
        System.out.println();
        
        for (int i=0; i<count.count; i++){
            String conn = ""; int u = 0;
            
            for (int v : count.compId){
                if (i == v) 
                    conn += u + " ";
                
                u++;
            }
            System.out.println("Connected Components " + (i+1) +": " +conn);
        }
    }
    
}
