import java.util.ArrayList;

class All_indexes_iterate {
    public static void main(String[] args) {
        int[] arr = {2,0,2,2,3};
        int key = 2;
        
        //
        ArrayList<Integer> keyindexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) keyindexes.add(i);
        }
        //
        
        System.out.println(keyindexes + " " + keyindexes.size());
    }
     // using iteration
    public static ArrayList<Integer> allIndexes(int[] arr, int key) {
        ArrayList<Integer> keyindexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key) keyindexes.add(i);
        }
        return keyindexes;
    }
}
