public class CoinChangeCombination {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int target = 7;


        // tabulation 
        // method 1:- using 2d dp
        int[][] dp2d = new int[arr.length+1][target+1];
        for (int i = 0; i < dp2d.length; i++) {
            for (int j = 0; j < dp2d[0].length; j++) {
                // base cases
                if (j==0){
                    dp2d[i][j] = 1;
                }
                else if (i==0){
                    dp2d[i][j] = 0;
                }
                // error out of bound
                else {
                    int val = arr[i-1];
                    if (j-val >= 0){
                        dp2d[i][j] = dp2d[i-1][j] + dp2d[i][j-val];
                    }
                    else {
                        dp2d[i][j] = dp2d[i-1][j];
                    }
                }
            }
        }
        System.out.println("Tabulation 2d: " + dp2d[arr.length][target]);
            
        // method 2:- using 1d dp (optimized approach)
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                // khud ki value + remaining value
                dp[j]  += dp[j-arr[i]]; 
            }
        }
        // for (int k : dp) {
        //     System.out.print(k + "\t");
        // }
        // System.out.println();
        System.out.println("Tabulation 1d: " + dp[target]);

        System.out.println("Recursion ans: "+ rec_ccc(arr, target,0));
    }
    
    // HW: using memoization

        

    // HW: using recursion
        static int rec_ccc(int[] arr, int tar, int i){
            if (tar==0) return 1;
            if (i>=arr.length || tar<0) return 0;
            int w = rec_ccc(arr, tar-arr[i],i);
            int wo = rec_ccc(arr, tar, i+1);
            return w+wo;
        }
}
