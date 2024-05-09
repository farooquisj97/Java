import java.util.*;
class NosPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        int[] arr = {1,23,5,7,67,34};
        for (int i : arr) {
            pq1.add(i);
        }
        System.out.println(pq1);
        int s = 3;
        System.out.print("smallest " + s + ":\t");
        for (int i = 0; i < s; i++) {
            System.out.print(pq1.remove() + " ");
        }

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : arr) {
            pq2.add(i);
        }
        int l = 3;
        System.out.print("\nlargest " + l + ":\t");
        for (int i = 0; i < l; i++) {
            System.out.print(pq2.remove() + " ");
        }
    }
}
