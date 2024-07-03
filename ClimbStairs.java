import java.util.Scanner;

public class ClimbStairs {
    
    // 3 step sizes possible
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];

        // Sir's method
        System.out.println(climb_up_dp(0, n, dp));
        System.out.println(climb_up_tab(n));
    }

    // Basic recursion
    static int climb_up(int i, int n){
        if (i==n) return 1;
        if (i>n) return 0;
        
        return climb_up(i+1, n) + climb_up(i+2, n) + climb_up(i+3, n);
    }    


    // Memoization
    static int climb_up_dp(int i, int n, int[] dp){
        if (i==n) return 1;
        if (i>n) return 0;
        if (dp[n]!=0) return dp[n];
        
        int ans = climb_up_dp(i+1, n, dp) + climb_up_dp(i+2, n, dp) + climb_up_dp(i+3, n, dp);
        dp[i] = ans;
        return ans;
    }    

    // Tabulation
    static int climb_up_tab(int n){
        int[] tab = new int[n+1];
        tab[n] = 1;
        for (int i = n-1; i >= 0; i--) {
            if (i == n-1){
                tab[i] = tab[i+1];
            }
            else if (i == n-2) {
                tab[i] = tab[i+1] + tab[i+2];
            }
            else {
                tab[i] = tab[i+1] + tab[i+2] + tab[i+3];
            }
        }
        for (int i : tab) {
            System.out.print(i + "\t");
        }
        return tab[0];
    }

}
