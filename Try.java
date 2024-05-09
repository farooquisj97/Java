import java.util.*;
class Try { 
    public static void main(String[] args) {
        String s1 = "hello";
        char[] c1 = s1.toCharArray();
        System.out.println(s1);
        Arrays.sort(c1);
        for (char c : c1) System.out.println(c);
    }
}
