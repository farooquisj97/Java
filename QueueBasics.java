import java.util.*;
public class QueueBasics {
    public static void main(String[] args) {
        // declare
        // Queue<Integer> que = new ArrayDeque<>();
        // System.out.println(que.size() + " -> " + que);

        // que.add(10);
        // que.add(20);
        // que.add(30);
        // System.out.println(que.size() + " -> " + que);

        // System.out.println(que.peek());

        // int val = que.remove();
        // System.out.println(val);

        // System.out.println(que.size() + " -> " + que);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        System.out.println(pq.size() + " -> " + pq);

        pq.add(50);
        pq.add(15);
        pq.add(25);
        System.out.println(pq.peek());
        System.out.println(pq.size() + " -> " + pq);
        pq.add(21);
        pq.add(20);
        pq.remove();
        System.out.println(pq.size() + " -> " + pq);
        pq.add(2);
        System.out.println(pq.size() + " -> " + pq);

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.size() + " -> " + pq);

        System.out.println();
        System.out.println("reverse order");
        System.out.println();

        PriorityQueue<Integer> pq_rev = new PriorityQueue<>(Collections.reverseOrder());
        pq_rev.add(50);
        pq_rev.add(15);
        pq_rev.add(25);
        System.out.println(pq_rev.peek());
        System.out.println(pq_rev.size() + " -> " + pq_rev);
        pq_rev.add(21);
        pq_rev.add(20);
        pq_rev.remove();
        System.out.println(pq_rev.size() + " -> " + pq_rev);
        pq_rev.add(2);
        System.out.println(pq_rev.size() + " -> " + pq_rev);

        System.out.println(pq_rev.remove());
        System.out.println(pq_rev.remove());
        System.out.println(pq_rev.remove());
        System.out.println(pq_rev.remove());
        System.out.println(pq_rev.remove());
        System.out.println(pq_rev.size() + " -> " + pq_rev);
        
    }
}

/*
 * shown horizontally
 * FIFO - first in first out
 * insert at end (last)
 * exit from top (first)
 * 
 * provides ruleset, discipline
 * 
 * queue >> only first element is visible
 * que.add() ~ enqueue
 * que.remove() ~ dequeue - first element as well as return peek
 * que.peek() ~ get first element
 * que.size()
 * 
 * declare: instance vs class
 * 
 * priority queue >> only smallest element is visible
 *                  ______  
 *          ________|____|_______
 *          |                    |
 *          |                    | 
 *          |____________________|
 *
 * pq.size()
 * pq.add() - O(logn)
 *          -- add element
 * pq.remove() - O(logn)
 *             -- remove as well return
 * pq.peek() - O(1)
 *           -- for highest priority element
 * 
 * priority order - heap order prop, complete binary tree prop, up/down heapify
 * abhi ke liye maan lo random order hai... can't predict the order
 * 
 */