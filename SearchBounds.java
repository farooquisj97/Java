public class SearchBounds {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 30, 30, 30, 40};
        System.out.print("array = { ");
        for (int val : arr) {
            System.out.print(val+" ");
        }
        int key = 30;
        int f_index = arr.length;
        int l_index = -1;
        System.out.println("}\nkey = "+key);
        
        // first index
        int low_l = 0, high_l = arr.length-1, mid_l = (low_l+high_l)/2;
        while(low_l<=high_l){
            if (arr[mid_l]<key){
                low_l = mid_l + 1;
            }   
            else if(arr[mid_l]==key) { 
                f_index = (f_index>mid_l)? mid_l:f_index;
                high_l = mid_l-1;
            }
            else {
                high_l = mid_l - 1;
            }
            mid_l = (low_l+high_l)/2;
        }
        System.out.println("first_index = "+f_index); 

        // last index
        int low_h = 0, high_h = arr.length-1, mid_h = (low_h+high_h)/2;
        while(low_h<=high_h){
            if (arr[mid_h]<key){
                low_h = mid_h + 1;
            }   
            else if(arr[mid_h]==key) { 
                l_index = (l_index<mid_h)? mid_h:l_index;
                low_h = mid_h+1;
            }
            else {
                high_h = mid_h - 1;
            }
            mid_h = (low_h+high_h)/2; 
        }
        System.out.println("last_index = "+l_index);

        System.out.println("key occurred " + (l_index - f_index + 1) + " times in the array");
    }
}
/*
 * sorted array
 * key repeating multiple times
 * find first and last index of occurrence
 */