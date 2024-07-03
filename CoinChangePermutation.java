import java.util.ArrayList;

public class CoinChangePermutation {
    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int tar = 7;

        int[] mdp = new int[tar+1];

        int dp[] = new int[tar+1];
        for (int i = 0; i <= tar; i++) {
            if(i==0) {
                dp[i] = 1;
            }
            for (int j = 0; j < arr.length; j++) {
                if (i-arr[j] >= 0){
                    int val = arr[j];
                    dp[i] += dp[i-val]; 
                }
                
            }

            for (int k : dp) {
                System.out.print(k + "\t");
            }System.out.println();       
        }

        System.out.println("Recursion ans: " + n_ccp(arr, tar));
        System.out.println("Tabulation ans: " + dp[tar]);
        System.out.println("Memoization ans: " + nm_ccp(arr, tar, mdp));
    }

    // recursion
    static int n_ccp (int[] arr, int tar){
        if (tar<0){
            return 0;
        }
        if (tar==0){
            return 1;
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int reAmt = tar-val;
            ans += n_ccp(arr, reAmt);
        }
        return ans;
    }

    // memoization
    static int nm_ccp (int[] arr, int tar, int[] dp){
        if (tar==0) return 1;
        if (tar<0) return 0;

        if (dp[tar]!=0) return dp[tar];
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int reAmt = tar-val;
            ans += n_ccp(arr, reAmt);
        }
        dp[tar] = ans;
        return ans;
    }
    
}


/*
 * give no of combinations possible and not the combinations
 * eg: available coins- 2,3,5  amount to pay- 7
 * combinations psossible: 223,232,322,25,52
 * therefore ans is 5 ie 5 combinations are possible
 * 
 */