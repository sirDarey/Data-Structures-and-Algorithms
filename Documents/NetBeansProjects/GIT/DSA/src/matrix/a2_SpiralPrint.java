package matrix;

/**
 *
 * @Sir Darey
 */
public class a2_SpiralPrint {
    
    void printSpiral (int[][]matrix, int r, int c) {
        // r - number of rows
        // c - number of columns
       
        int i, k = 0, l = 0;
        
        while (k < r && l < c) {
            
            for (i=l; i<c; i++) {
                System.out.print(matrix[k][i] + "  ");
            }
            k++;

            for (i=k; i<r; i++) {
                System.out.print(matrix[i][c-1] + "  ");
            }
            c--;

            if (k < r) {
                for (i=c-1; i>=l; i--) {
                    System.out.print(matrix[r-1][i] + "  ");
                }
                r--;
            }

            if (l < c) {
                for (i=r-1; i>=k; i--) {
                    System.out.print(matrix[i][l] + "  ");
                }
                l++;
            }   
            
        }
        
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
        a2_SpiralPrint spiral = new a2_SpiralPrint();
        
        int[][] matrix = { {5, 10, 15, 20, 25},
                           {7, 14, 21, 28, 35},
                           {9, 18, 27, 36, 45},
                           {11, 22, 33, 44, 55},
                           {13, 26, 39, 52, 65}
                         };
        spiral.display(matrix);
        System.out.println();
        
        spiral.printSpiral(matrix, matrix.length, matrix.length);
    }
}
