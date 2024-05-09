class SearchFirstLastIndex {
    public static void main(String[] args) {
        int[] arr = {1,5,2,5,3,5,7};
        int key = 7;
        System.out.println("first occurrence "+ first_index(arr, key, 0));
        System.out.println("last occurrence "+ last_index(arr, key, arr.length-1));   
    }

    static int first_index(int[] arr, int key, int i){
        if (i==arr.length) return -1;
        if (arr[i]==key) return i;                      
        int fi = first_index(arr, key, i+1);
        return fi;
    }

    static int last_index(int[] arr, int key, int i){
        if (i==-1) return -1;
        if (arr[i]==key) return i;                      
        int li = last_index(arr, key, i-1);            
        return li;
    }
}

// preorder is better as complexity is less
// post order me likha toh it traverses through the entire array which is unnecessary