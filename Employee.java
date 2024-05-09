import java.util.Scanner;

class Employee {
public static void main (String[] args) {
	Scanner read = new Scanner(System.in);
	int salary;
	System.out.print("Employee salary: ");
	salary = read.nextInt();
	if (salary > 90000)
		System.out.println("Class I Employee");
	else if (salary > 60000)
		System.out.println("Class II Employee");
	else if (salary > 50000)
		System.out.println("Class III Employee");
	else if (salary > 30000)
		System.out.println("Class IV Employee");
	else
		System.out.println("Class V Employee");
}
}