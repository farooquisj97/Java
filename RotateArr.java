import java.util.*;
class RotateArr {
    static void rev(int[] arr, int i, int j){
        int temp;
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int rotate = -15;
        int[] a = {1,2,3,4,5,6,7,8,9};
        int n = a.length;
        if (rotate < 0) {
            while (rotate<0) rotate += n;
        }
        int k = rotate % n;
        for (int val: a) System.out.print(val + "\t");
        System.out.println();
       
        // method 1
        // while (rotate>0){
        //     int temp = a[0];
        //     for (int i=0; i<n; i++){
        //         if (i==n-1) a[i] = temp;
        //         else a[i] = a[i+1];
        //     }
        //     for (int i: a) System.out.print(i + "\t");
        //     System.out.println();
        //     rotate--;
        // }

        // method 2
        // int[] b = new int[n];
        // int k = rotate;
        // int i=n-k;
        // int j=0;
        // while(i<n){
        //     b[j] = a[i];
        //     i++;j++;
        // }
        // i = 0;
        // while (i<n-k){
        //     b[j] = a[i];
        //     i++;j++;
        // }
        // for (int val: b) System.out.print(val + "\t");   

        // method 3 best method
        
        RotateArr.rev(a, (n-k), (n-1));
        RotateArr.rev(a, 0, (n-k-1));
        RotateArr.rev(a, 0, (n-1));
       
        for (int val: a) System.out.print(val + "\t");
    } 
}
