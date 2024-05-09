import java.util.Arrays;
import java.util.Scanner;
public class ArrayExp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] usrArr = new int[n];
        for (int i = 0; i < n; i++) {
            usrArr[i] = sc.nextInt();
        }
        for (int val : usrArr) System.out.print(val + " ");


        int[] num = {45,2,3,4,5,6,7,8,9};
        for (int i : num)
            System.out.print(i + "\t");
        System.out.println();
        Arrays.sort(num);
        for (int i : num) System.out.print(i + "\t");
    }
}
