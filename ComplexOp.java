import java.util.Scanner;

class Complx {
    double real, img;
    Scanner sc = new Scanner(System.in);
    Complx(double x, double y) {
        real = x;
        img = y;
    }
    Complx(){}
    void inputData() {
        System.out.print("Enter real{num1}: ");
        real = sc.nextDouble();
        System.out.print("Enter imaginary{num1}: ");
        img = sc.nextDouble();
    }
    Complx add(Complx c1) {
        double re  = real + c1.real;
        double im = img + c1.img;
        return new Complx(re,im);
    }
    Complx sub(Complx c1) {
        double re  = real - c1.real;
        double im = img - c1.img;
        return new Complx(re,im);
    }    
    Complx mul(Complx c1) {
        double re = real * c1.real - img * c1.img;
        double im = real * c1.img + c1.real * img;
        return new Complx(re,im);    
    }
    Complx div(Complx c1) {
        double re = (real*c1.real + img*c1.img)/(c1.real*c1.real + c1.img*c1.img);
        double im = (img*c1.real - real*c1.img)/(c1.real*c1.real + c1.img*c1.img);
        return new Complx(re,im);    
    }
    void show(String out){
        System.out.println(out + real +" + "+ img + "j");
    }
}

class ComplexOp {
    public static void main (String[] args) {
        Complx c1 = new Complx(5,10);
        Complx c2 = new Complx();
        c2.inputData();
        Complx sum = c2.add(c1);
        Complx dif = c2.sub(c1);
        Complx pro = c2.mul(c1);
        Complx quo = c2.div(c1);
        c1.show("Num1: ");
        c2.show("Num2: ");
        sum.show("Summation: ");
        dif.show("Difference: ");
        pro.show("Product: ");
        quo.show("Quotient: ");
    }
}