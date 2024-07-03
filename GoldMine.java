public class GoldMine {
    public static void main(String[] args) {
        int[][] grid = {{1,2,3,0,2},{2,1,2,7,6},{5,2,8,3,1},{4,3,2,0,0},{8,0,1,1,0}};

        int r = grid.length;
        int c = grid[0].length;

        // tabulation
        int[][] dp = new int[r][c];
        for (int j = c-1; j >= 0; j--) {
            
            for (int i = r-1; i >= 0; i--) {
            
                // last column
                if (j==c-1){
                    dp[i][j] = grid[i][j];
                }

                // bottom row
                else if (i==r-1) {
                    dp[i][j] = grid[i][j] + getMax(dp[i-1][j+1] , dp[i][j+1]);
                }

                // top row
                else if (i==0) {
                    dp[i][j] = grid[i][j] + getMax(dp[i][j+1], dp[i+1][j+1]);
                }

                else{
                    dp[i][j] = grid[i][j] + getMax(dp[i-1][j+1] , dp[i][j+1], dp[i+1][j+1]);
                }
            } 
            
        }

        printArr(dp);
        System.out.println();

        int ans = dp[0][0];
        for (int i = 0; i < dp[0].length; i++) {
            ans = (dp[i][0] > ans)? dp[i][0] : ans;

        }
        
        System.out.println(ans);
    }

    static int getMax(int... arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = (arr[i]>max)? arr[i] : max;
        }
        return max;
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
 * given rxc matrix
 * allowed: horizontal, forward up, forward down
 * start from any element in 0th column
 * collect max gold
 * 
 * Leetcode 1219
 * allowed: right, left, up, down
 * never visit "0" val
 *  
 */