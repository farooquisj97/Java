import java.util.*;
class StacksBasics {
    public static void main(String[] args) {
        //declare
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.size() + " >> " + stack);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.size() + " >> " + stack);

        int val  = stack.peek();
        System.out.println(val);

        val = stack.pop();
        System.out.println(val);
        System.out.println(stack.size() + " >> " + stack);

        val = stack.pop();
        System.out.println(val);
        val = stack.pop();
        System.out.println(val);
        val = stack.pop();
        System.out.println(val);
        System.out.println(stack.size() + " >> " + stack);
 

    }
}

/*
 * declaration similar to array list
 * 
 * stack.size()
 * stack.push(element) ~ add of arraylist
 * stack.peek() ~ element at top / end element return karta hai
 * stack.pop() - element remove bhi hota hai n return bhi karta hai
 * 
 * stack empty hai aur pop/peek kiya toh error aayega
 */