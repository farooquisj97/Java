public class RecPattern {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n){
        if (n==0) return;
        System.out.print(n+" ");
        pattern(n-1);
        System.out.print(n+" ");
        pattern(n-1);
        System.out.print(n+" ");
    }
}
