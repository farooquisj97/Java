import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        StringBuilder s1  = new StringBuilder("abc");
        ArrayList<String> al = new ArrayList<>();
        al.add("");
        permutations(s1, al);
        
    }
    public static void permutations(StringBuilder ques, ArrayList<String> ans){
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            StringBuilder ros = ques.deleteCharAt(i);
            //for (String s: ans)
                //permutations(ros, s+ch);
        }

//     public static void permutations(String ques, ArrayList<String> ans){
//         if (ques.length()==0){
//             System.out.println(ans);
//             return;
//         }
//         char ch = ques.charAt(i);
//         StringBuilder ros = ques.delete(i,i);
    }

    public static void permutn (String ques, String ans) {
        if (ques.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String ros = ques.substring(0, i) + ques.substring(i+1);
            permutn(ros, ans+ch);
        }

    }


}
