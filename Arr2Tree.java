import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Arr2Tree {

    public static class Node{
        int val;
        Node left;
        Node right;

        //
        Node(int data, Node left, Node right){
            this.val = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair{
        Node node;
        int state;

        Pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4, null, null, 5, 6, null, null, null, 3, 7, null, 9, null, null, 8, null, null};

        Node root = construct(arr);
        traverse(root);
        System.out.println();
        removeLeaves(root);
        traverse(root);
    }    

    static void traverse(Node n){
        if (n == null) return;
        System.out.println(n.val);
        traverse(n.left);
        traverse(n.right);
    }

    public static Node construct(Integer[] arr){
        Node root = new Node(arr[0], null, null);

        Stack<Pair> stack = new Stack<>();

        Pair p = new Pair(root, 0);
        stack.push(p);

        int idx = 1;

        while(stack.size() > 0){
            Pair obj = stack.peek();

            if(obj.state == 0){         // lc
                if(arr[idx] == null){
                    idx++;
                    obj.state++;
                }
                else{   
                    Node temp = new Node(arr[idx], null, null);
                    
                    obj.node.left = temp;

                    idx++;

                    obj.state++;

                    Pair t = new Pair(temp, 0);
                    stack.push(t);
                }
            }
            else if(obj.state == 1){    // rc
                if(arr[idx] == null){
                    idx++;
                    obj.state++;
                }
                else{   
                    Node temp = new Node(arr[idx], null, null);
                    
                    obj.node.right = temp;

                    idx++;

                    obj.state++;

                    Pair t = new Pair(temp, 0);
                    stack.push(t);
                }

            }
            else{           //2
                stack.pop();
            }
        }

        return root;        
    }

    static void removeLeaves (Node n){
        if (n == null) return;
        if (n.left!=null && (n.left.left==null && n.left.right==null)) {
            n.left = null;
        }
        if (n.right!=null && (n.right.left==null && n.right.right==null)) {
            n.right = null;
        }

        removeLeaves(n.left);
        removeLeaves(n.right);
    }


}

    



/*
 * 
 * 1. ek node bana lo pointing to null initially
 * 2. ek stack of pair bana lo { class Pair (Node node, int state)}
 * 3. first node push karna hai with state 0
 * 4. when stack>0 begin
 * 4.1. check state and work accordingly
 *      0 -> left side: not null
 *                     ek node banao with given val
 *                     point karna hai
 *                     index badhao
 *                     state badhao
 *                     push node, 0
 *                      null: increment index and state
 *      1 -> right side: no null
 *                     ek node banao with given val
 *                     point karna hai
 *                     index badhao
 *                     state badhao
 *                     push node, 0
 *                      null: increment index and state
 *      2 -> work done: pop
 *    end
 *                      
 */

