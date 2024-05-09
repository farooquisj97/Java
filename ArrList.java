import java.util.*;

class ArrList {
    public static void main(String[] args) {
        //declare
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println(al.get(2));
        al.set(1,20);
        System.out.println(al.size());
        System.out.println(al.get(1));
        al.remove(1);
        System.out.println(al.size());

    }    
}

/*
 * al.add(element)
 * al.get(index)
 * al.set(index,element)
 * al.remove(index)
 * al.size() ~length
 * al.contains(element)
 * 
 * 
 * sliding window
 * max sum subarray (continuous)
 * size equals k (say 3)
 * given 1d array {2,-1,3,0,7,-2}
 * print the sum
 * 
 */
