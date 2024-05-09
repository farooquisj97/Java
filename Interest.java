import java.util.Scanner;
import java.lang.Math;

class Interest {
public static void main (String[] args) {
	Scanner read = new Scanner(System.in);
	double p, r, t, n, si, ci;
	//simple interest & compound interest
	System.out.println("Principle amount: ");
	p = read.nextDouble();
	System.out.println("Rate of interest: ");
	r = read.nextDouble();
	System.out.println("Time period: ");
	t = read.nextDouble();
	System.out.println("No. of time compounded per year: ");
	n = read.nextDouble();
	si = (p*r*t)/100;
	ci = p*(Math.pow((1+r/(100*n)),(n*t)))-p;
	System.out.println("Simple Interest = " + si);
	System.out.println("Compound Interest = " + ci);
}
}