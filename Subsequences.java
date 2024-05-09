import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        String s1 = "abc";
        //ArrayList<String> al = getSubsequences(s1);
        //display(al);
        //System.out.println(al);
        
        printSubsequences(s1, "");

        // String s2 = "c ";
        // System.out.println("subtring is \"" + s2.substring(1) + "\"");
    }

    public static void printSubsequences(String ques, String ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        printSubsequences(ros, ans + "-"); 
        printSubsequences(ros, ans + ch);       
    }

    public static ArrayList<String> getSubsequences(String str){
        
        // basecase of experts: blank string ka ek subsequence exist karta hai ie blank string itself
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        // basecase other way: isme blank string ka ans nhi aayega
        if(str.length()==1){
            ArrayList<String> base = new ArrayList<>();
            base.add("-");
            base.add(""+str.charAt(0));
            return base;
        }

        char ch = str.charAt(0);
        ArrayList<String> res = getSubsequences(str.substring(1));
        display(res); 
        ArrayList<String> ans = new ArrayList<>();
        for (String s : res){
            ans.add("-" + s);
        }
        display(ans);        
        for (String s : res){
            ans.add(ch+"" + s);
        }
        display(ans);
        return ans;
    }

    public static void display(ArrayList al){
        for (Object o : al) {
            System.out.println(o);
            System.out.println();
        }
    } 
}
/*
 * need not be cintinuous like substring
 * relative order needs to be maintained
 * 
 * given string (say "abc")
 * get all subsequences
 *      - arraylist
 *      - stringbuilder
 * recurrsion
 * 
 */