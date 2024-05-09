import java.util.*;
class AllSubstrings {
    public static void main(String[] args){
        String s1 = "hello";

        // hello>hell>hel>he>h.....
        // for (int i=0; i<s1.length(); i++){
        //     for (int j=s1.length(); j>=i+1; j--){
        //         System.out.println(s1.substring(i,j));
        //     }
        // }
        
        // h>he>hel>hell>hello.....
        // for (int i=0; i<s1.length(); i++){
        //     for (int j=i+1; j<=s1.length(); j++){
        //         System.out.println(s1.substring(i,j));
        //     }
        // }

        // lengthwise
        // for (int j=1; j<=s1.length(); j++){
        //     for (int i=0; i<s1.length(); i++){
        //         if (i+j<=s1.length()) System.out.println(s1.substring(i,i+j));
        //     }
        // }

        //lengthwise
        int n =s1.length();
        for (int j=1; j<=n; j++){
            for (int i=0; i<=n-1; i++){
                System.out.println(s1.substring(i,j));n--;

            }
            
        }
    }
}
