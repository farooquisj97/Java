import java.util.Stack;
public class DuplicateBrackets {
    public static void main(String[] args) {
        String s1 = "((c+d)+(a+b))";
        System.out.println(checkDuplicate(s1));
        System.out.println(checkDuplicacy(s1));
    }

    // fails for cases like "((c+d)+(a+b))"
    public static boolean checkDuplicate(String str){
        Stack<String> stack  = new Stack<>();
        boolean ans = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            if (ch!=')'){
                stack.push(ch+"");
            }
            else {
                String val = "";
                while(stack.size()>0 && val!="(") {
                    val = stack.pop();
                    count++;
                } 
                ans = (count==0)? true : false;
            }
            
        }
        return ans;
    }

    // 
    public static boolean checkDuplicacy(String str){
        Stack<Character> stack  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch==')'){
                if (stack.size()>0 && stack.peek()=='('){
                    return true;
                }
                Character val = ' ';
                while(stack.size()>0 && val!='(') {
                    val = stack.pop();
                } ;
            }
            else {
                stack.push(ch);
            }
        }
        return false;
    }
}
/*
 * generally bracket waale questions stack se hi hote hai
 * 
 * given balanced brackets
 * (a+b) >> false
 * ((a+B)) >> true
 * (a+b)+(c+d) >> false
 * ((a+b)+(c+d)) >> false
 * (((a+b)+(c+d))) >> true
 * a+(b) >> false
 * a+((b)) >> true
 * (a+(b/c))
 * 
 */