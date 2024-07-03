import java.util.Scanner;

public class VarStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // step sizes possible
        int[] ss = {2,3,0,2,2,3};
        System.out.println(varClimb_dp(0, n, ss));
    }

    // Recursion
    static int varClimb(int i, int n, int[] ss){
        if (i==n) return 1;
        if (i>n) return 0;

        int val = ss[i];
        int ans = 0;
        for (int j = 1; j <= val; j++) {
            ans += varClimb(i+j, n, ss);
        }
        return ans;
    }

    // Tabulation
    static int varClimb_dp(int p, int n, int[] ss){
        int[] dp = new int[n-p+1];
        dp[n] = 1;

        for (int i = n-1; i >= p; i--) {
            int val = ss[i];
            for (int j = 1; j <= val && i+j <= n; j++) {
                dp[i] += dp[i+j];             
            }

            // for (int k : dp) {
            //     System.out.print(k + "\t");
            // }
            // System.out.println();
        }
        return dp[p];
    }
}
