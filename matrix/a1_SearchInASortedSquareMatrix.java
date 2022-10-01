package matrix;

/**
 *
 * @Sir Darey
 */
public class a1_SearchInASortedSquareMatrix {
    
    void search (int[][]matrix, int n, int x) {
        // n - Dimension of the square matrix
        // x - Search Key
        
        int i = 0, j = n-1;
        
        while (i < n && j >= 0) {
            
            if (matrix[i][j] == x) {
                System.out.println("Search Key Found!!!");
                return;
            }
            
            if (matrix[i][j] > x)
                j--;
            else
                i++;                
        }
        
        System.out.println("Search Key NOT Found");
    }
    
    void display (int [][]matrix) {
        
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();                    
        }
    }
    
    public static void main(String[] args) {
        a1_SearchInASortedSquareMatrix search = new a1_SearchInASortedSquareMatrix();
        
        int[][] matrix = { {5, 10, 15, 20, 25},
                           {7, 14, 21, 28, 35},
                           {9, 18, 27, 36, 45},
                           {11, 22, 33, 44, 55},
                           {13, 26, 39, 52, 65}
                         };
        search.display(matrix);
        System.out.println();
        
        int key = 13;
        System.out.println("Searching for Key : " +key);
        search.search(matrix, matrix.length, key);
    }
}
