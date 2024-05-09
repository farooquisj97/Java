class A {
    void calc(double a) {
        System.out.println(a*a);
    }
}
class B extends A {
    
    void calc(double a) {
        super.calc(a);
        System.out.println(a*a*a);
    }
}
class Overriding {
    public static void main(String[] args) {
        A obj = new B();
        obj.calc(2);
       // obj.calc(2.0);
    }
}
