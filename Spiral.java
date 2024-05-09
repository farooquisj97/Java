class Spiral {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,101},{5,6,7,8,102},{9,10,11,12,103},{13,14,15,16,104}};
        for (int[] a : arr){
            for (int b : a){
                System.out.print(b + "\t");
            }
            System.out.println();
        }
        spiral(arr);        
    }
    static void spiral(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for (int k=0; k<n; k++){
            int i=k,j=m-k-1;
            if (i==k){
                for (int j1=k; j1<m-k-1; j1++) {
                    System.out.print(arr[i][j1]+" ");
                }
            }
            if (j==m-k-1){
                for (int i1=k; i1<n-k; i1++) {
                    System.out.print(arr[i1][j]+" ");
                }
            }
            i = n-k-1; 
            j = k;
            if (i==n-k-1){
                for (int j2=m-k-1-1; j2>=k; j2--) {
                    System.out.print(arr[i][j2]+" ");
                }
            }
            if (j==k){
                for (int i2=n-k-1-1; i2>k; i2--) {
                    System.out.print(arr[i2][j]+" ");
                }
            }
        }
    }
}
/*
 * print in spiral order
 * 
 * 1  2  3  4
 * 5  6  7  8 
 * 9  10 11 12
 * 13 14 15 16
 * 
 * output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 * 
 * 
 * https://hack.codingblocks.com/app/contests/5693/991/problem
 * this code does not satisfy the above problem statement
 * 
 */