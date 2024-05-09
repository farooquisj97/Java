class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 20;
        int low = 0, high = arr.length-1, mid = (low+high)/2;
        while(low<=high){
            mid = (low+high)/2;
            if (arr[mid]==key){
                System.out.println(key +" at location "+ mid);
                break;
            }
            else if (arr[mid]>key){
                high = mid - 1;
            }
            else {//arr[mid]<key
                low = mid + 1;
            }
        }
    }
}
