package engine;

public class EngineInfo {
    public int power;
    public String modelNo;
    public String type;
    public double cost;
    
    public EngineInfo(int power, String modelNo, String type, double cost) {
        this.power = power;
        this.modelNo = modelNo;
        this.type = type;
        this.cost = cost;
    }

    // Display Method
    public void display() {
        System.out.println("Power: " + power);
        System.out.println("Model No: " + modelNo);
        System.out.println("Type: " + type);
        System.out.println("Cost: " + cost);
    }
}
