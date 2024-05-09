import java.util.Scanner;

class Factorial {
    int n, fact;
    Scanner sc = new Scanner(System.in);
    Factorial(){
        System.out.print("Who's factorial do you want to calculate? ");
        n = sc.nextInt();
        fact = this.calcFactorial(n);
    }
    int calcFactorial(int n){
        if (n==1) return 1;
        else return(n*calcFactorial(n-1));
    }
    public static void main(String[] args){
        Factorial obj = new Factorial();
        System.out.println("Factorial of " + obj.n + " is " + obj.fact);        
    } 
}
