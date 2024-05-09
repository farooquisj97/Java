public class Search2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{21,22,23,24,25},{26,27,28,29,30}};
        int n = arr.length;
        int m = arr[0].length;
        int key = 22;
        int[] location = {-1, -1};

        // linear search
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j]==key) {
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        // binary search
        for (int i = 0; i < n; i++) {
            int low = 0, high = arr.length-1, mid = (low+high)/2;
            while(low<=high){
                mid = (low+high)/2;
                if (arr[i][mid]==key){
                    System.out.println(key +" at location "+ i + "," + mid);
                    break;
                }
                else if (arr[i][mid]>key){
                    high = mid - 1;
                }
                else {//arr[i][mid]<key
                    low = mid + 1;
                }
            }
        }

        // print array
        for (int[] i : arr) {
            for (int val : i) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
        System.out.println(key + " found at array index " + location[0] + "," + location[1]);
    }
}
/*
 * linear search in 2d array
 * n row 
 * m column
 * complexity O(n*m)
 * 
 * 
 * sorted 2d array ==> binary search... yeh bhi karna hai ab
 * 
 */