public class Fibonacci {
    static int fibo(int n){
        if (n==0||n==1) return n;
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args){
        int n = 11;
        for (int i = 0; i < n; i++) {
            int fn = fibo(i);
            System.out.print(fn+"\t");
        }
    }
}
