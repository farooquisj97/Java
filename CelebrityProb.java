import java.util.*;

public class CelebrityProb {
    public static void main(String[] args) {
        int[][] arr = {{0,1,0,1},{0,1,0,0},{0,1,1,0},{1,1,0,0}};
        
        // setting diagonal zero
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (i==j) arr[i][j] = 0;
        //     }
        // }
        
        //currently ignoring diagonal elements
        display(arr);
        System.out.println(celeb(arr));
        
    }

    public static boolean celeb (int[][] arr){
        for (int person = 0; person < arr.length; person++) {
            if (knowsNone(arr, person)){
                //System.out.println(person);
                if (knownByAll(arr, person)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean knowsNone(int[][] arr, int i) {
        for (int j = 0; j < arr.length; j++) { 
            if (i==j){
                continue;
            }
            else if (arr[i][j]!=0) {
                return false;
            }
        }
        return true;
    }

    public static boolean knownByAll (int[][] arr, int j){
        for (int i=0; i<arr.length; i++){
            if (i==j){
                continue;
            }
            else if (arr[i][j]!=1) {
                return false;
            }
        }
        return true;
    }

    public static void display(int[][] arr) {
        for (int[] val : arr) {
            for (int element : val) {
                System.out.print(element+"\t");                
            }
            System.out.println();
        }
    }
}

/*
 * celebrity: jisko sab jaante hai and jo kisiko nhi janta
 *            
 * given: sq matrix of order n ==> n people
 * row ==> jaanta hai       (cant be celeb)
 * column ==> ko jaanta hai (can be celeb)
 * 
 *      A   B   C   D
 * A    0   1   0   1
 * B    0   0   0   0
 * C    1   1   0   0
 * D    1   1   1   0
 * 
 * B is celeb in the above case
 * if celeb exists return true else false
 * only one celeb possible
 * 
 * O(n^2) me karna easy
 * can be done in O(n) using stack
 *    
 * 
 */