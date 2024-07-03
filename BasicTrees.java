import java.util.*;

public class BasicTrees {

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

        // System.out.println("Sum of all nodes: " + sum(node));
        // System.out.println("No. of nodes: " + count(node));
        // System.out.println("Max val: " + max(node));
        // System.out.println("Min val: " + min(node));
        // System.out.println("Node height: " + nodeHeight(node));
        // System.out.println("Edge height: " + edgeHeight(node));
        // singleChildNodes(node);
        // func(node);
        // pattern(node);

        // ArrayList<Integer> al = new ArrayList<>();
        // ArrayList<Integer> al0 = new ArrayList<>();
        // ArrayList<Integer> al1 = new ArrayList<>();
        // ArrayList<Integer> al2 = new ArrayList<>();
        // allOrder(node, al0, al1, al2);
        // System.out.println(al0);
        // System.out.println(al1);
        // System.out.println(al2);
        // System.out.println(inTree(node,5));
    
        // ArrayList<Integer> path = new ArrayList<>();
        // path2root(node, 7, path);
        // System.out.println(path);

        // int k = 2;
        // atLevelK(node, k);
    
    }

    static void traverse(Node n){
        if (n == null) return;
        System.out.println(n.val);
        traverse(n.left);
        traverse(n.right);
    }

    static void allOrder(Node n, ArrayList<Integer> al0, ArrayList<Integer> al1, ArrayList<Integer> al2){
        if (n == null) return ;
        al0.add(n.val);
        allOrder(n.left, al0, al1, al2);
        al1.add(n.val);
        allOrder(n.right, al0, al1, al2);
        al2.add(n.val);

    }

    // preorder list
    static void elements(Node n, ArrayList<Integer> al){
        if (n == null) return ;
        al.add(n.val);
        elements(n.left, al);
        elements(n.right, al);
    }

    // in order list
    static void elements1(Node n, ArrayList<Integer> al){
        if (n == null) return ;
        elements1(n.left, al);
        al.add(n.val);
        elements1(n.right, al);
    }

    // post order list
    static void elements2(Node n, ArrayList<Integer> al){
        if (n == null) return ;
        elements2(n.left, al);
        elements2(n.right, al);
        al.add(n.val);
    }

    static int sum(Node n){
        if (n==null) return 0;
        return sum(n.left) + sum(n.right) + n.val ;
    }
    
    static int count(Node n){
        if (n==null) return 0;
        return count(n.left) + count(n.right) + 1 ;
    }

    static int max(Node n){
        if (n==null) return Integer.MIN_VALUE;
        int ans = Math.max(n.val,(Math.max(max(n.left), max(n.right))));
        return ans;
    }
    
    static int min(Node n){
        if (n==null) return Integer.MAX_VALUE;
        int ans = Math.min(n.val,(Math.min(min(n.left), min(n.right))));
        return ans;
    
    }

    static int nodeHeight(Node n){
        if (n==null) return 0;
        int l = nodeHeight(n.left)+1;
        int r = nodeHeight(n.right)+1;
        return Math.max(l,r);
    }
    
    static int edgeHeight(Node n){
        if (n==null) return -1;
        int l = edgeHeight(n.left);
        int r = edgeHeight(n.right);
        return Math.max(l,r)+1;
    }

    static void func(Node n){
        if (n==null) return;
        System.out.println("pre " + n.val);
        func(n.left);
        System.out.println("in " + n.val);
        func(n.right);
        System.out.println("post " + n.val);
    }
    
    static void pattern(Node n){
        if (n==null) return;
        Integer l = (n.left != null)? n.left.val : null;
        Integer r = (n.right != null)? n.right.val : null;
        System.out.println(l + "\t-->\t" + n.val + "\t<--\t" + r);
        pattern(n.left);
        pattern(n.right);
    }

    static boolean inTree(Node n, int tar){
        if(n==null) return false;
        if (n.val==tar) return true;
        boolean f1 = inTree(n.left, tar);
        if (f1) return true;
        boolean f2 = inTree(n.right, tar);
        return f1 || f2;
    }

    static boolean path2root(Node n, int tar, ArrayList<Integer> al){
        if(n==null) return false;
        if (n.val==tar){
            al.add(n.val);
            return true;
        }
        boolean f1 = path2root(n.left, tar, al);
        if (f1) {
            al.add(n.val);
            return true;
        }
        boolean f2 = path2root(n.right, tar, al);
        if (f2) {
            al.add(n.val);
            return true;
        }
        return f1 || f2;
    }

    static void atLevelK(Node n, int k){
        if (n==null) return;
        if (k==0){
            System.out.println(n.val);
            return;
        }
        atLevelK(n.left, k-1);
        atLevelK(n.right, k-1);
        return; 
    }

    static void singleChildNodes (Node n){
        if (n == null) return;
        if ((n.left==null && n.right!=null) || (n.left!=null && n.right==null)){
            System.out.println(n.val);
        }
        singleChildNodes(n.left);
        singleChildNodes(n.right);
    }

    
}

/*
 * basics of trees ==> Recursion 
 * 
 * types:
 *      - binary tree (2,1,0): every node will have 2 or 1 or 0 children
 *      - generic tree
 * 
 *                          node
 *                         /    \
 *                        /      \
 *                       /        \
 *                    child1    child2
 * 
 * 
 * top node is the main node
 * for binary search tree child1<node, child2>node
 * 2 me se 1 option choose karna hai
 * for binary tree (0 <= no of child nodes <= 2)
 * for generic tree there can be any no of children
 * 
 * decision lena hai - eg:search a word in dictionary, file system (efficient organization), 
 *                        mathematical expression(jo operator ki priority zyada hai woh neeche aata hai),
 * 
 * codeshare.io/1VPVW7
 * 
 */