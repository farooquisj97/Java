class WaveTransversal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        for (int j = 0; j < arr[0].length; j++) {
            if (j%2==0){
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i][j]);
                }
            }
            else {
                for (int i = arr.length - 1 ; i >= 0; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
/* 
 * Columnwise Wave Transversal
 * 
 * 1 2 3 10
 * 4 5 6 11
 * 7 8 9 12
 * 
 * print order 1 4 7 8 5 2 3 6 9 12 11 10
 * 
 */