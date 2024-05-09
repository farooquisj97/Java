import java.util.Scanner;

class Vehicle {
	String no;
	String name;
	int price;
	int year;
	String fuelType;
	int seatNum;
	Scanner s1 = new Scanner(System.in);
	void initialize(String no, String name, int price, int year, String fuelType, int seatNum) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.year = year;
		this.fuelType = fuelType;
		this.seatNum = seatNum;
	}
	void inputData() {
		System.out.print("Enter vehicle no:\t\t");
		no = s1.nextLine();
		System.out.print("Enter vehicle name:\t\t");
		//s1.nextLine();
		name = s1.nextLine();
		System.out.print("Enter vehicle price:\t\t");
		price = s1.nextInt();
		System.out.print("Enter vehicle year:\t\t");
		year = s1.nextInt();
		System.out.print("Enter vehicle fuel type:\t");
		s1.nextLine();
		fuelType = s1.nextLine();
		System.out.print("Enter vehicle seat number:\t");
		seatNum = s1.nextInt();		
	}
	void displayData() {
		System.out.println();
		System.out.println("Vehicle no:\t\t" + no);
		System.out.println("Vehicle name:\t\t" + name);
		System.out.println("Vehicle price:\t\t" + price);
		System.out.println("Vehicle year:\t\t" + year);
		System.out.println("Vehicle fuel type:\t" + fuelType);
		System.out.println("Vehicle seat number:\t" + seatNum);	
	}
}
	
class VehicleDetails {
	public static void main (String[] args) {
		Vehicle v1 = new Vehicle();
		v1.initialize("MH31EU4261", "S78", 450000, 2019, "electric", 2);
		Vehicle v2 = new Vehicle();
		v2.inputData();
		v1.displayData();
		v2.displayData();
	}
}