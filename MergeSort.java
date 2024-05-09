import java.util.*;
class MergeSort {
    // complexity is nlogn (where base is 2)
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2,8};
        int[] ans = merge_sort(arr, 0, arr.length-1);
        display(ans);
    }    

    // recursive solution
    public static int[] merge_sort(int[] arr, int i, int j){
        // base case
        if (i==j) {
            int[] base_arr = new int[1];
            base_arr[0] = arr[i];
            return base_arr;
        }
        
        int mid = (i+j)/2;
        int[] left_arr = merge_sort(arr, i, mid);
        int[] right_arr = merge_sort(arr, mid+1, j);

        int[] ans = mergeTwoSortedArrays(left_arr, right_arr);
        return ans;
    }

    // iterative soltion
    public static int[] mergeTwoSortedArrays(int[] larr, int[] rarr){
        int[] ans = new int[larr.length+rarr.length];
        int i = 0;
        int j = 0;
        for (int k=0; k<ans.length; k++){
            if (i<larr.length && j<rarr.length){
                if (larr[i]<rarr[j]){
                    ans[k] = larr[i];
                    i++;
                }
                else {
                    ans[k] = rarr[j];
                    j++;
                }
            }
            else if (i>=larr.length){
                ans[k] = rarr[j];
                j++;
            }
            else {
                ans[k] = larr[i];
                i++;
            }
        }
        return ans;
    }

    public static void display(int[] arr){
        for (int val : arr) {
            System.out.println(val + " ");
        }
    }

}
