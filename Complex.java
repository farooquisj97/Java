import java.util.Scanner;

class ComplexOperations {
    double reA, imA, reB, imB;
    double reAdd, imAdd, reSub, imSub, reMul, imMul, reDiv, imDiv;
    Scanner sc = new Scanner(System.in);

    ComplexOperations(double p, double q, double x, double y) {
        reA = p;
        imA = q;
        reB = x;
        imB = y;
    }
    ComplexOperations(){}
    void inputData() {
        System.out.print("Enter re{num1}: ");
        reA = sc.nextDouble();
        System.out.print("Enter im{num1}: ");
        imA = sc.nextDouble();
        System.out.print("Enter re{num2}: ");
        reB = sc.nextDouble();
        System.out.print("Enter im{num2}: ");
        imB = sc.nextDouble();
    }
    void add() {
        reAdd = reA + reB;
        imAdd = imA + imB;
        System.out.println("Summation: " + reAdd + " + " + imAdd + "j");
    }
    void sub() {
        reSub = reA - reB;
        imSub = imA - imB;
        System.out.println("Difference: " + reSub + " + " + imSub + "j");
    }
    /*
    mul = (reA + imA)*(reB + imB)
        = reA*reB + reA*imB + reB*imA - imA*imB
     */
    void mul() {
        reMul = reA * reB - imA * imB;
        imMul = reA * imB + reB * imA;
        System.out.println("Multiplication: " + reMul + " + " + imMul + "j");
    }
    void div() {
        reDiv = (reA*reB + imA*imB)/(reB*reB + imB*imB);
        imDiv = (imA*reB - reA*imB)/(reB*reB + imB*imB);
        System.out.println("Division: " + reDiv + " + " + imDiv + "j");
    }
    void displayOprations() {
        System.out.println();
        System.out.println("Num1 = " + reA + " + " + imA + "j");
        System.out.println("Num2 = " + reB + " + " + imB + "j");
        add();
        sub();
        mul();
        div();
    }
}  
class Complex {
    public static void main (String[] args) {
        ComplexOperations c1 = new ComplexOperations(25,46,62,58);
        ComplexOperations c2 = new ComplexOperations();
        c2.inputData();
        c1.displayOprations();
        c2.displayOprations();
    }
}