import java.util.ArrayList;
import java.util.Scanner;

public class ClimbStairsMinMoves {
    public static void main(String[] args) {
        int[] arr = {3,2,4,2,0,2,3,1,2,2};
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 10;

        // Tabulation
        Integer[] dp = new Integer[n+1];
        dp[n] = 0; 

        for (int i = n-1; i>=0; i--){
            if (arr[i] != 0){    
                
                int val =Integer.MAX_VALUE;
                for (int j = 1; j <= arr[i] && i+j<=n; j++) {
                    if (dp[i+j]!=null) {
                        val = Math.min(val, dp[i+j]);
                    }
                }

                if (val!= Integer.MAX_VALUE){
                    dp[i] = val+1;
                }
            }
        }
        System.out.println(dp[0]);

        //System.out.println(min_moves(0,10, arr));
    }

    // debug
    static int min_moves(int p, int n, int[] arr){
        int[] dp = new int[n-p+1];
        dp[n] = 0;
        for (int i = n-1; i>=0; i--) {
            int val = arr[i];
            int min = val;
            if(min==0){dp[i]= 100;}
            for (int j = 1; j <= val && i+j <= n; j++) {
                min = (dp[i+j] < min)? dp[i+j]: min;
                dp[i] = min + 1;
                System.out.println(min + " " + dp[i+j]);
            }

            for (int k : dp) {
                System.out.print(k + "\t");
            }
            System.out.println();
        }
        return dp[p];
    }


}


/*
 * 
 * too many corner cases
 *      - if jump size is zero
 *      - default value in dp (int vs Integer)
 * 
 * 
*/