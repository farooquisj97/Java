class PrintArrRec {
    public static void main(String[] args) {
        int[] arr = {11,22,22,262,22,22,33,33,44,55};
        //display_inc(arr, 0);  
        //display_dec(arr, arr.length-1);
        System.out.println(max_val(arr, arr.length-1));
        System.out.println(max(arr, 0));
    }
    
    public static void display_inc(int[] arr, int index) {
        if (index==arr.length) return;
        System.out.println(arr[index]);
        display_inc(arr, index+1);
    }

    public static void display_dec(int[] arr, int index) {
        if (index==-1) return;
        System.out.println(arr[index]);
        display_dec(arr, index-1);
    }

    public static int max_val(int[] arr, int index) {
        if (index==1){
            //return (arr[index]>arr[index-1])? arr[index] : arr[index-1];
            return (arr[1]>arr[0])? arr[1] : arr[0];
        }
        return (arr[index]>max_val(arr, index-1))? arr[index] : max_val(arr, index-1);
    }

    //method 2
    public static int max(int[] arr, int index) {
        if (index==arr.length-1) return arr[index];
        int temp = max(arr,index+1);
        if (arr[index]>temp) temp = arr[index];
        return temp;
    }


}