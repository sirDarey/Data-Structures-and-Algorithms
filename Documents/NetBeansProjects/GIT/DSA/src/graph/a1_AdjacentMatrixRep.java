package graph;

/**
 *
 * @Sir Darey
 */
public class a1_AdjacentMatrixRep {
    private int V; //Number of vertices
    private int E; //Number of Edges
    private int [][] adjMatrix;
    
    public a1_AdjacentMatrixRep(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }
    
    public void addEdge (int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
        E++;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V).append(" Vertices, ").append(E).append(" Edges\n");
        
        for (int v=0; v<V; v++) {
            sb.append(v).append(":  ");
            for (int u : adjMatrix[v]) {
                sb.append(u).append(" ");
            }
            sb.append("\n");
        }
        
        return sb.toString();
        
    }
    
    public static void main(String[] args) {
        a1_AdjacentMatrixRep create = new a1_AdjacentMatrixRep(4);
        
        create.addEdge(0, 1);
        create.addEdge(1, 2);
        create.addEdge(2, 3);
        create.addEdge(3, 0);
        
        System.out.println(create);
    }
    
}
