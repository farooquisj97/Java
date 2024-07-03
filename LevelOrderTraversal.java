import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderTraversal {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int v, Node l, Node r){
            val = v;
            left = l;
            right = r;
        }

    }
    public static void main(String[] args) {
        
        Node node = new Node(1, null, null);
        node.left = new Node(2, null, null);
        node.right = new Node(3, null, null);
        node.left.left = new Node(4, null, null);
        node.left.right =new Node(5, null, null);
        node.left.right.left =new Node(6, null, null);
        node.right.left =new Node(7, null, null);
        node.right.right =new Node(8, null, null);
        node.right.left.right =new Node(9, null, null);

        
        levelOrderTraversal(node);
        levelOrderTraversal1(node);
    }

    // remove print add
    static void levelOrderTraversal(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (q.size()>0){
            Node n = q.remove(); 
            System.out.print(n.val + " ");
            if (n.left != null) {
                q.add(n.left);
            }
            if (n.right != null) {
                q.add(n.right);
            }
        }
        System.out.println();
    }

    static void levelOrderTraversal1(Node node){
        Queue<Node> q = new ArrayDeque<>();
        q.add(node);
        while (q.size()>0){
            int size = q.size(); 
            for (int i = 0; i < size; i++) {
                Node n = q.remove(); 
                System.out.print(n.val + " ");

                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }
            // for new level in new line
            System.out.println();
        }
    }

    // HW: level order zigzag { 1 3 2 4 5 7 8 9 6 } for same and different line
    // hint: 2 queues are required

}


/*
 * 
 * BFS - breadth first search
 * non recursive function
 * 
 * complexity O(N) hi hai where N is no. of nodes in the tree
 * while me for hai toh bhi complexity O(N) hi rahegi
 * 
 * steps:
 * create a queue of node
 * manually add root node
 * 
 * work till q.size() > zero
 *      remove node (temp me store kar liya)
 *      print temp node val
 *      if not null, add its children
 * 
 * for new level in new line:
 * 
 * 
 * 
 * 
 */