import java.util.Scanner;

class BMI {
	public static void main (String[] args) {
		Scanner obj = new Scanner(System.in);
		float weight, height, bmi;
		System.out.print("Enter weight in kg: ");
		weight = obj.nextFloat();
		System.out.print("Enter height is m: ");
		height = obj.nextFloat();
		bmi = (weight) / (height * height);
		System.out.println("BMI = " + bmi);
	}
}