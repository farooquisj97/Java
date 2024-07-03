public class CountBinary {
    public static void main(String[] args) {
        int n = 4;
        int[][] mdp = new int[n+1][2];

        // tabulation
        int[][] dp = new int[n+1][2];
        dp[1][0] = 1;
        dp[1][1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][1] = dp[i-1][0] + dp[i-1][1];
        }

        System.out.println("Tabulation ans: " + (dp[n][0] + dp[n][1]));
        //System.out.println("Memoization ans: " + Mn_str(n, -1, mdp));
        System.out.println("Recursion ans: " + n_str(n,-1));
    }

    // memoization debug
    static int Mn_str(int n, int b, int[][] dp){
        
        if (dp[n][b] != 0 ) return dp[n][b];

        for (int i = 1; i < dp.length; i++) {
            if (i == 1){
                dp[i][0] = 1;
                dp[i][1] = 2;
            }
            else{
                int a0 = (b!=0)? Mn_str(i-1, 0, dp): 0;
                int a1 = Mn_str(i-1, 1, dp);
                int ans = a0 + a1;
                dp[i][b] = ans;
            }
        }
    
        return dp[n][b];
    }

    // recursion
    static int n_str(int n, int b){
        if (n == 1){
            return (b!=0)? 2 : 1;
        }
        if (n == 0 ) return 0;
        
        int a0 = (b!=0)? n_str(n-1, 0): 0;
        int a1 = n_str(n-1, 1);
        return a0 + a1;
    }
}

/*
 * constraint: there cannot be two consecutive zeros
 * 
 */