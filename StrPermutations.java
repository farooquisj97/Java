import java.util.ArrayList;

public class StrPermutations {
    public static void main(String[] args) {
        prmtn("abc", "");
    }
    

    // not correct
    static void prmtn(String ques, String ans){
        //base case
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        prmtn(ros, ch+ans);
        prmtn(ros, ans+ch);
    }

}
