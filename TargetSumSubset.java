import java.util.ArrayList;
import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {4,2,7,1,3};
        // int target = sc.nextInt();
        int target = 100;

        // tabulation
        Boolean[][] dp = new Boolean[arr.length+1][target+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                
                // base cases
                if (j==0){
                    dp[i][j] = true;
                }
                else if (i==0){
                    dp[i][j] = false;
                }
                
                // main case
                else {
                    int val = arr[i-1];
                    // to check error out of bound
                    if (j-val >= 0){
                        // always depends on uper waali row (i-1)
                        dp[i][j] = (dp[i-1][j] || dp[i-1][j-val]);;
                    }

                    else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        // printArr(dp);

        System.out.println("Tabulation ans: " + dp[arr.length][target]);
        System.out.println("Recursion answer: " + target_sum_subset(arr, target, arr.length-1));
        System.out.println("No. of ways (using recursion): " + n_tss(arr, target, arr.length-1));

    }

    // HW: do by recursion
    static Boolean target_sum_subset (int[] arr, int target, int i){
        //base case
        if (target == 0) return true;
        if (i < 0 || target < 0) return false;

        boolean include = target_sum_subset(arr, target - arr[i], i - 1);
        boolean exclude = target_sum_subset(arr, target, i - 1);
        return include || exclude;
    }

    // HW: count how many target sum subsets
    static int n_tss(int[] arr, int target, int i){
        if(target==0) return 1;
        if (i<0 || target<0) return 0;
        int w = n_tss(arr, target - arr[i], i-1);
        int wo = n_tss(arr, target, i-1);
        return w+wo;
    }

    static void printArr(Boolean[][] arr){
        for (Boolean[] row : arr){
            for (Boolean bool : row) {
                System.out.print(bool + "\t");
            }
            System.out.println();
        }
    }

    // wrong logic may not be suitable for all test cases
    static Boolean target_sum_subset (int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((sum + arr[j]) < target) {
                    sum += arr[j];
                }
                else if ((sum + arr[j]) == target) {
                    return true;
                }
                else {
                    continue;
                }
            }
        }
        return false;
    }

}


/*
 * 
 * subarray => continuous, in order
 * subset => in order & need not be continuous
 * 
 * no of subsets = 2^n 
 * koi element aayega ya nhi aayega
 * 
 * (option)^level
 * 
 * consider arr {4,2,7,1,3}
 * dp ka smaller question: 
 * for element 2... and target 6 chahiye...
 *      2 nhi aayega ==> 2 ke pehle waale elements ko hi sum generate karna padega
 *      2 aayega ==> 2 ke pehle waale elements ko (target-2) ie 4 sum generate karna padega
 * 
 * 
 *  elements | Target =>    0   1   2   3   4   5   6   7   8   9   10
 *      x                   y   n   n   n   n   n   n   n   n   n   n
 *      4                   y   n   n   n   y   n   n   n   n   n   n
 *      2                   y   n   y   n   y   n   y   n   n   n   n
 *      7                   y   n   y   n   y   n   y   y   n   n   n
 *      1                   y   n   y   n   y   n   y   y   n   n   n
 *      3                   y   n   y   n   y   n   y   y   n   n   n
 * 
 * condition kya bani? 
 * 
 * 
 */