public class FloodFill {
    public static void main(String[] args){
        int[][] arr = {{0,0,0,0,0,0},{0,1,1,1,1,0},{0,1,1,0,0,0},{0,0,0,0,1,0},{0,1,1,0,1,0},{0,1,1,0,0,0}};
        
        for (int[] val : arr) {
            for (int element : val) {
                System.out.print(element+"\t");                
            }
            System.out.println();
        }

        floodfill(arr, 0, 0, "");
        System.out.println("done");
    }
    public static void floodfill(int[][] arr, int i, int j, String path){
        if (i<0 || j<0 || i==arr.length || j==arr[0].length || arr[i][j]==1 || arr[i][j]==2){
            return;
        }
        if (i==arr.length-1 && j==arr[0].length-1){
            System.out.println(path);
            return;
        }
    
        arr[i][j] = 2;
        floodfill(arr, i-1, j, path+"t");
        floodfill(arr, i, j-1, path+"l");
        floodfill(arr, i+1, j, path+"d");
        floodfill(arr, i, j+1, path+"r");
        arr[i][j] = 0;
    }
    
    public static void display2D(int[][] arr) {
        System.out.println();
        for (int[] val : arr) {
            for (int element : val) {
                System.out.print(element+"\t");                
            }
            System.out.println();
        }
    }
}
/*
 * 
 */