import java.util.*;

class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("China", 200);
        map.put("US", 50);
        map.put("UK", 30);

        int val = map.get("India");
        System.out.println(val);

        Integer val1 = map.get("Australia");
        System.out.println(val1);

        map.put("India", 100);

        System.out.println(map);
       

        HashMap<Integer, Integer> m2 = new HashMap<>();
        m2.put(0,5);
        m2.put(5,0);
        m2.put(10,10);
        m2.put(0,6);
        System.out.println(m2);

        for(int key: m2.keySet()){
            int v = m2.get(key);
            System.out.println(key + " = " + v);
        }




    }
}
/*
 * hm -> hashmap
 * hm.put(key, value) -- enter or update - O(1)
 * hm.get(key) -- returns value - O(1)
 * hm.containsKey(key) -- returns boolean (true of false) - O(1)
 * 
 * hm.keySet() -- foreach loop lagane ke liye - O(n)
 * 
 * priority order -> hashcode
 * 
 */