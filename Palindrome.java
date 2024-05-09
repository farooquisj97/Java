class Palindrome {
    public static void main(String[] args) {
        String s1 = "naman";

        // method 1
        // String rev = "";
        // for (int i=s1.length()-1; i>=0; i--){
        //     rev = rev + s1.charAt(i);
        //     System.out.println(rev);
        // 
        // if (s1.equals(rev)) System.out.println("Is palindrome");
        // else System.out.println("Not palindrome");

        // method 2
        int i=0, j=s1.length();
        int flag = 0;
        while(i<j){
            if (s1.charAt(i)!=s1.charAt(j)) {
                flag = 1;
                break;
            }
            else{
            i++;
            j--;
            }
        }
        if (flag==0) System.out.println("Is palindrome");
        else System.out.println("Not palindrome");
    }
}
