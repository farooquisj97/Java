import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //System.out.println(fibo(n));
        int[] dp = new int[n+1];
        System.out.println(fibo_dp(n, dp));

    }

    static int fibo(int n){
        if (n==0 || n==1){
            return n;
        }

        // just to check no. of function calls
        // System.out.print(n);
        int fn = fibo(n-1) + fibo(n-2);
        return fn;
    }

    static int fibo_dp(int n, int[] dp){
        if (n==0 || n==1) return n;
        if (dp[n] != 0) return dp[n];

        //System.out.println(n);
        int fn = fibo_dp(n-1,dp) + fibo_dp(n-2,dp);
        dp[n] = fn;
        return fn;
    }
}
