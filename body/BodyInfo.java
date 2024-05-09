package body;

public class BodyInfo {
    // Attributes
    public String metal;
    public String color;
    public String tyre;
    public double cost;

    // Constructor
    public BodyInfo(String metal, String color, String tyre, double cost) {
        this.metal = metal;
        this.color = color;
        this.tyre = tyre;
        this.cost = cost;
    }

    // Display Method
    public void display() {
        System.out.println("Metal: " + metal);
        System.out.println("Color: " + color);
        System.out.println("Tyre: " + tyre);
        System.out.println("Cost: " + cost);
    }
}
