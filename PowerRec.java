class PowerRec { 
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }

    // NOT FUNCTIONAL YET optimized code
    public static int power(int x, int n) {
        if (n==0) return 1;
        int val = power(x, n/x);
        System.out.println(val);
        if (n/x==0){
            System.out.println(val + " " + val*x);
            return val*x;
        }
        else {
            System.out.println(n%x);
            return val*x*power(x, n%x);
        }
    }

    // for base = 2 only
    public static int pow2(int n){
        if (n==0) 
            return 1;
        int ans = pow2(n/2);
        if (n%2==0) 
            return ans*ans;
        else
            return ans*ans*2;
    } 

    // basic
    // static int power(int x, int n){
    //     if (n==0) return 1;
    //     else {
    //         return x*power(x,n-1);
    //     }
    // }
}
