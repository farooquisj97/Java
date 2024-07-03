import java.util.Scanner;

public class MaxVowel {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(goodString(s1));
    }
    static int goodString (String s){
        
        int count = 0;
        int ans = count;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // method 1
            if (is_vow(ch)){
                count++;
            }
            else{
                
                ans = (ans>count)? ans : count;
                count = 0;
            }

            // method 2
            if (is_vow(ch)){
                count++;
                ans = Math.max(ans, count);
            }
            else{
                count = 0;
            }
        }
        return ans;
    }
    static Boolean is_vow(char ch){
        if (ch == 'a' || ch =='e' || ch =='i' || ch =='o' || ch =='u') return true;
        else return false;
    }
}
