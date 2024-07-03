public class BestPath {
    public static void main(String[] args) {
        int[][] grid = {{1,2,2,10,20},{20,3,0,1,3},{4,30,2,0,1},{1,0,3,2,5}};
        int r = grid.length;
        int c = grid[0].length;
        System.out.println(r + " " + c);

        // tabulation
        int[][] dp = new int[r][c];
        for (int i = r-1; i >= 0; i--) {
            for (int j = c-1; j >= 0; j--) {
                System.out.println(i + " " + j);

                // last
                if (i==r-1 && j==c-1) {
                    dp[i][j] = grid[i][j];
                }

                // column
                else if (j==c-1){
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }

                // row
                else if (i==r-1){
                    dp[i][j] = grid[i][j] + dp[i][j+1];
                }

                // (i<r-1 && j<c-1)
                else  {
                    dp[i][j] = grid[i][j] + Math.min(dp[i+1][j],dp[i][j+1]);
                }
                printArr(dp);
              
                
            }
        }

        System.out.println(dp[0][0]);
    }

    static void printArr(int[][] a){
        for (int[] a1 : a){
            for (int a2 : a1) {
                System.out.print(a2 + "\t");
            }
            System.out.println();
        }
    }
}

/*
 * Minimum Cost Path
 * Leetcode 746
 * 
 * given m x n matrix
 * move from (0,0) to (m-1, n-1)
 * min cost 
 * 
 * moves allowed ==> horizontal and vertical
 * 
 * similar to flood fill....
 * 
 * 
 * why 2D dp?
 *      - given 2D array
 *      - 1d arr, amount ie array & a target is given
 * 
 * 
 * 
*/