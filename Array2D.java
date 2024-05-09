import java.util.*;
class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][4]; // 3rows 4columns
        arr[1][2] = 10;
        //System.out.println(arr[0][0]);

        // user defined array and input
        // Scanner sc = new Scanner(System.in);
        // int[][] usr_arr = new int[sc.nextInt()][sc.nextInt()];
        // System.out.println("enter the elements");
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         usr_arr[i][j]  = sc.nextInt();
        //     }
        // }
        
        int[][] box = {{1,2,3},{4,5,6},{7,8,9}};

        // print elements using for each loop
        for (int[] val : box) {
            for (int element : val) {
                System.out.print(element+"\t");                
            }
            System.out.println();
        }
        
        // print elements using for loop
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         System.out.print(arr[i][j]+"\t");
        //     }
        //     System.out.println();
        // }

        // print elements columnwise
        // for (int j=0; j<box[0].length; j++){
        //     for (int i = 0; i < box.length; i++) {
        //         System.out.println(box[i][j]);
        //     }
        // }
    }
}
