import java.util.*;
class CommonElement {
    public static void main(String[] args) {
        int[] a1 = {1,1,2,2,2,3,5};
        int[] a2 = {1,1,1,2,2,5,8,9};
        getCommon1(a1, a2);
            
    }

    public static HashMap<Integer, Integer> createHashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                val++;
                map.put(key,val);
            }
            else {
                map.put(key,1);
            }
        }
        return map;
    }
    
    public static void getCommon1(int[] a1, int[] a2){
        HashMap<Integer, Integer> m1 = createHashMap(a1);
        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 0; i < a2.length; i++) {
            int key = a2[i];
            if (m1.containsKey(key)){
                if (common.contains(key)) continue;
                else {
                    common.add(key);
                    System.out.println(key);
                }            
            }
        }
    }

    public static void getCommon2(int[] a1, int[] a2){
        HashMap<Integer, Integer> m1 = createHashMap(a1);
        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 0; i < a2.length; i++) {
            int key = a2[i];
            if (m1.containsKey(key)){
                int val = m1.get(key);
            }
        }
    }

}
