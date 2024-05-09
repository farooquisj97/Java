public class SubString {
    public static void main(String[] args) {
        String s1 = "Hello!! How are you??###";
        String s2 = "Hello";
        System.out.println(s1.indexOf(s2));   
        System.out.println(s1.length());
        String s3 = s1.substring((s1.length()-3));
        System.out.println(s3);     
        String s4 = s3.concat(s1) + s3;
        System.out.println(s4);
        String s5 = s1.substring(0,3);
        System.out.println(s5);
    }
}
