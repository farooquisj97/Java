import engine.EngineInfo;
import body.BodyInfo;
 

class Car {
    public static void main(String[] args) {
        // Creating an instance of EngineInfo
        EngineInfo engine1 = new EngineInfo(200, "Model00158BE", "Electric", 15000.00);

        // Creating an instance of BodyInfo
        BodyInfo body1 = new BodyInfo("Steel", "Red", "Standard", 20000.00);

        // Displaying information
        System.out.println("Engine Information:");
        engine1.display();
        System.out.println("\nBody Information:");
        body1.display();
    }
}


/*
 * file >> new >> package > name
 * package name == folder name
 * class name == file name.java
 * 
 * deefine all public
 */
