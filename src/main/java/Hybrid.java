package main.java;

public class Hybrid implements CarType {

    @Override
    public void carTypeGreeting() {
        System.out.println("You've got a Hybrid!");
        
    } 
    
    /**
     * Method to add a color to the hybrid.
     */
    public void color(String color) {
        
        if (color.equalsIgnoreCase("silver")) {
            System.out.println("Color is silver.");
        } else if (color.equalsIgnoreCase("white")) {
            System.out.println("Color is white.");
        } else {
            System.out.println("Hybrid does not come in that color. Order again");
        }
    }
    
    /**
     * Method to add a specific number of cylinders
     * to the hybrid.
     */
    public void cylinders(int cylinder) {
        
        if (cylinder == 2) {
            System.out.println("Cylinder number is 2");
        } else if (cylinder == 4) {
            System.out.println("Cylinder number is 4");
        } else {
            System.out.println("\nHybrid does not come with " + cylinder 
                    + "cylinder(s), only 2 or 4. Order again.");
        }
    }
    
    /**
     * Method to that specifies the transmission type.
     * 1 is automatic. Hybrid only comes automatic.
     */    
    public void tranmission(int auto) {
        if (auto == 1) {
            System.out.println("Transmission is automatic.");
        } else {
            System.out.println("Hybrid transmission does not come in manual.");
        }
    }
    
    /**
     * Method to that specifies the tire size.
     * Hybrid tire size comes in 15,16, 17 inches. 
     */ 
    public void tireSize(int size) {
        if (size == 15) {
            System.out.println("Tire Size is 15 inches.");
        } else if (size == 16) {
            System.out.println("Tire Size is 16 inches.");
        } else if (size == 17) {
            System.out.println("Tire Size is 17 inches.");
        } else {
            System.out.println("Tire size not available for Hybrid. Pick again.");
        }
    }
        
    
    
    
}
