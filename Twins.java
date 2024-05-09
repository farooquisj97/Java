import java.util.*;
public class Twins {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //String s = "axaxa";
        StringBuilder sb = new StringBuilder(s);
		System.out.println(twins(sb, 0));
    }

	public static int twins(StringBuilder str, int i){
		if (i==str.length()-2) return 0;
        int count = twins(str, i+1);
        if (str.charAt(i)==str.charAt(i+2)) count++;
        return count;
	}
}
