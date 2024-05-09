public class CoinToss {
    public static void main(String[] args) {
        toss_n(3,"");
    }
    public static void toss_n(int n, String combo){
        if(n==0){
            System.out.println(combo);
            return;
        }
        toss_n(n-1, combo + "H");
        toss_n(n-1, combo + "T");
    };
}
