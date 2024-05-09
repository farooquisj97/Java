class MethodOverloading {
    static double calc(int a) {
        return(a*a);
    }
    static double calc(double a) {
        return(a*a*a);
    }
    public static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        double sq = m1.calc(25);
        double cube = m1.calc(7.0);
        System.out.println("Square = " + sq);
        System.out.println("Cube = " + cube);
    }
}
