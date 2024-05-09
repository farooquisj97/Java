//import java.util.Arrays;
public class Transpose {
    public static void main(String[] args) {
        int[][] a1 = {{1,2,12},{3,4,34},{5,6,56}};
        int n = a1.length;
        int m = a1[0].length;
        // int[][] t1 = new int[n][m];
        // for (int i=0; i<n; i++){
        //     for (int j=0; j<m; j++){
        //         t1[j][i] = a1[i][j];
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         System.out.print(a1[i][j] + "\t");
        //     }
        //     System.out.println(); // Print newline after each row
        // }
        // System.out.println(a1.length + "," + a1[0].length);
        // for (int i = 0; i < m; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(t1[i][j] + "\t");
        //     }
        //     System.out.println(); // Print newline after each row
        // }
        // System.out.println(t1.length + "," + t1[0].length);

        //making changes in the same matrix itself {sqare matrix only}
        int[][] a2 = a1;
        for (int[] ks : a2) {
            for (int es : ks) {
                System.out.print(es+"\t");
            }
            System.out.println();
        }
        int i=0, j=0, temp=0;
        while(i<n){
            while (j<m) {
                if (i!=j){
                    temp = a2[i][j];
                    a2[i][j] = a2[j][i];
                    a2[j][i] = temp;
                }
                j++;
            }
            i++;
        }
        for (int[] ks : a2) {
            for (int es : ks) {
                System.out.print(es+"\t");
            }
            System.out.println();
        }
    }
}
/*
 * swap across diagonal
 */