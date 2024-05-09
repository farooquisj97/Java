 
class RecPrint {
    static void decreasing(int n){
        if (n==0) {
            return;
        }
        else {
            System.out.println(n);
            decreasing(n-1);
        }
    }
    static void increasing(int n){
        if (n==0) {
            return;
        }
        else {
            increasing(n-1);        // ans backtrack hoke print ho raha hai
            System.out.println(n);
        }
    }
    static void inc_dec(int n){
        if (n==0) return;
        else {
            System.out.println(n);
            inc_dec(n-1);
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        // RecPrint.decreasing(n);
        // RecPrint.increasing(n);
        inc_dec(n);
    }
}

/*
 * a(){
 *      //pre-order
 *      a()
 *      //post-order
 * }
 */
