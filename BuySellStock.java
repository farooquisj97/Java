public class BuySellStock {
    public static void main(String[] args) {
        int[] arr = {5,10,12,10,9,5,4,6,10,15};


        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]<arr[i]){
                profit += (arr[i]-arr[i-1]);
            }
        }
        System.out.println("total profit: " + profit);
    }

    static int tx_2() {
        int[] arr = {5,10,15,20,14,16,25,11,7,2,10,3,12,20};

    }
}
