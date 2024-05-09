import java.util.*;

public class BalancedBrackets {
    public static void main(String[] args) {
        String s1 = "[[assd]]{()}";
        System.out.println(checkBalance(s1));
    }

    public static boolean checkBalance(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            char top = ' ';
            if (ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if (ch==')' || ch=='}' || ch==']') {
                if (stack.size()==0){
                    return false;
                }
                if (isComplimemtary(ch, top)){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else{
                continue;
            }

            System.out.println(stack.size() + "--" + i + "--" + stack);
        }
        if (stack.size()>0) return false;
        else return true;
    }

    public static boolean isComplimemtary(char ch, char top){
        if (top=='(' && ch==')'){
            return true;
        }
        else if (top=='{' && ch=='}'){
            return true;
        }        
        else if (top=='[' && ch==']'){
            return true;
        }
        return false;
    }

}
/*
 * reasons to return false:
 * 
 * type mismatch
 * more opening brackets
 * more closing brackets
 * 
 * last 
 * 
 */