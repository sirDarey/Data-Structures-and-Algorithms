package graph;

/**
 *
 * @Sir Darey
 */
public class a7_IslandProblem {
    
    private int row, column, count;
    private boolean [][] visited;
    private int[][] grid;
    
    public a7_IslandProblem(int row, int[][] input) {
        this.row = row;
        this.grid = input;
        count = 0;
        column = this.grid[0].length;
        visited  = new boolean [this.row][column];              
    }
    
    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        
        sb.append("The Input Grid is given as: \n");
        for (int i=0; i<row; i++) {
            sb.append("[ ");
            for (int j : grid[i]) {
                sb.append(j).append(" ");
            }
            sb.append("]\n");
        }
        
        return sb.toString();
    }
    
    public void countIslands () {
        
        for (int i=0; i<row; i++) {
            for (int j=0; j<column; j++) {
                if (!visited[i][j] && grid[i][j]==1) {
                    recur (i, j);
                    count++;
                }
            }            
        }        
    }
    
    void recur (int row, int column) {
        if (row < 0 || column < 0
                || row >= this.row ||  column >= this.column
                || visited[row][column] || grid[row][column]==0)
            
            return;
        
        visited[row][column] = true;
                
        recur (row-1, column); //Go Up
        recur (row, column+1); //Go Right
        recur (row, column-1); // Go Left
        recur (row+1, column); // Go Down
    }
    
    public static void main(String[] args) {
        int[][] input = { {1, 1, 0, 1},
                          {1, 0, 0, 1},
                          {0, 0, 1, 0},
                          {0, 0, 0, 1}
                        };
        
        a7_IslandProblem is = new a7_IslandProblem(input.length, input);
        
        System.out.println(is);
        is.countIslands();
        System.out.println("The Number of Islands is: " +is.count);
        
    }    
    
}
