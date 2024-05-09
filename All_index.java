import java.util.*;
class All_index {
    public static void main(String[] args){
        int[] arr = {2,0,2,2,3};
        // index     0 1 2 3 4 5 6 7 8 9 10
        int key = 2;

        // int count = 0;
        // //ArrayList<Integer> ans = new ArrayList<Integer>();
        // //all_index_0(arr, key, 0, ans);
        // // int[] res = all_index_1(arr, arr.length-1, key, count);

        int[] res = findIndex(arr, 0, key, 0);
        for (int i : res) System.out.print(i + " ");      
    }

    // fsf = found so far
    public static int[] findIndex (int[] arr,  int index, int key,int fsf){
        // base case: ALLOCATING MEMORY... size of array
        if (index==arr.length){
            int[] ans = new int[fsf]; // new
            return ans;
        }
        if (arr[index]==key){
            int[] ans = findIndex(arr, index+1, key, fsf+1);
            ans[fsf] = index;
            return ans;
        }
        else{
            int[] ans = findIndex(arr, index+1, key, fsf);
            return ans;           
        }

    }

    // this code works
    // public static int all_index_0(int[] arr, int key, int i, ArrayList<Integer> ans){
    //     if (i==arr.length) return -1;
    //     if (arr[i]==key) ans.add(i);
    //     return all_index_0(arr, key, i+1, ans);
    // }

    // this does not works
    // public static int[] all_index_1(int[] arr, int i, int key, int count){
    //     if (i==-1) return null;
    //     if (arr[i]==key) {
    //         count++;
    //         System.out.println(count);
    //     }
    //     int[] ans = all_index_1(arr, i-1, key, count);
    //     if (arr[i]==key) {
    //         count -= 1;
    //         ans[count]=i;
    //         System.out.println(ans[count]);
    //     }         
    //     return ans;
    // }

}