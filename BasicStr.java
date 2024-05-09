import java.util.*;
class BasicStr {
    public static void main(String[] args) {
        //declare
        String s1 = "whats your name??", s2;
        System.out.println(s1);
        Scanner sc = new Scanner(System.in);
        //s2 = sc.nextLine();
        s2 = "sarah";
        System.out.println("hello " + s2);
        s2 = "friend";
        System.out.println(s1.substring(0,6));
        for (int i=0; i<s2.length(); i++) {
            System.out.print(s2.charAt(i)+"-");
        }

        System.out.println();
        for (char c: s2.toCharArray()) System.out.print(c + " ");

        System.out.println();
        String s3 = new String("friend");
        System.out.println(s2==s3);
        String s4 = "friend";
        System.out.println(s2==s4); //heap memory ki location check karta hai sirf
        
        s4 = s4 +'d';
        System.out.println(s4);
    }
}


/*
 *  Strings are non-primitive data structures
 *  Non-primitive data stuctures use heap memory while pritive data types use stack
 *  strings ==> str.length() --> function
 *  arrays ==> arr.length --> field/instance variable
 *  str.charAt(index)
 *  strings are immutable: koi char set nhi kar sakte but entirely change kar sakte hai
 *  str.split()
 *  str.trim()
 *  interning:- to save memory.... jab s4 declare kiye toh it observed heap me same string hai..its pointing to its location...kinda pointer system hai
 *  immutability:- coz of intering... ek change kiya toh baaki change na ho.... srt.setChar() does not exists
 *  dont use str==str1 instead use .equals() method 
 *  str.equals(str1).... first checks location, then if required checks char by char
 */