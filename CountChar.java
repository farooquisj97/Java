import java.util.Scanner;

class CountChar { 
public static void main (String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String str = s1.nextLine(); 
	str = str.toLowerCase();
	int vowels=0, consonant=0, specialChar=0, digit=0; 
	for (int i = 0; i < str.length(); i++) { 
		char ch = str.charAt(i); 
		if ( ch >= 'a' && ch <= 'z') {					
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
				vowels++; 
			else
				consonant++; 
		} 
		else if (ch >= '0' && ch <= '9') 
			digit++; 
		else
			specialChar++; 
	}	
	System.out.println("Vowels: " + vowels); 
	System.out.println("Consonant: " + consonant); 
	System.out.println("Digit: " + digit); 
	System.out.println("Special Characters: " + specialChar); 
}
} 