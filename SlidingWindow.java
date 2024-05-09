class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {-1,3,0,7,2,-3,4};
        //int window_size = 3;
        int max_sum = 0;
        for(int i=0; i<arr.length-2; i++){
            int sum=arr[i]+arr[i+1]+arr[i+2];
            //System.out.println(sum);
            max_sum = (max_sum>sum)? max_sum : sum;
        }
        System.out.println(max_sum);
    }
}
