abstract class Shape {
    int d1;
    int d2;
    Shape(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int length, int width) {
        super(length, width);
    }
    void printArea() {
        System.out.println("Area of Rectangle: " + (d1*d2));
    }
}
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }
    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * d1 * d2));
    }
}
class Circle extends Shape {
    Circle(int radius) {
        super(radius, radius);
    }
    void printArea() {
        System.out.println("Area of Circle: " + (3.141592 * d1 * d2));
    }
}
class ShapeArea {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3, 10);
        r1.printArea();
        Triangle t1 = new Triangle(6, 3);
        t1.printArea();
        Circle c1 = new Circle(7);
        c1.printArea();
    }
}