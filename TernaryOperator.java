import java.util.Scanner;

class TernaryOperator {
public static void main (String[] args) {
	int a, b, c, largest, smallest;
	Scanner read = new Scanner(System.in);
	System.out.println("Enter 3 numbers:");
	a = read.nextInt();
	b = read.nextInt();
	c = read.nextInt();
	largest = (a>b)? ((a>c)? a:c) : ((b>c)? b:c); 
	smallest = (a<b)? ((a<c)? a:c) : ((b<c)? b:c); 
	System.out.println("Largest: " + largest);
	System.out.println("Smallest: " + smallest);
}
}