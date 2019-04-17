package factorypattern;

public class Truck implements CarType {
    
    @Override
    public void carTypeGreeting() {
        System.out.println("You've got a Truck!");
        
    } 

    /**
     * Method to add a color to the truck. 
     */
    public void color(String color) {
        
        if (color.equalsIgnoreCase("red")) {
            System.out.println("Color is red.");
        } else if (color.equalsIgnoreCase("white")) {
            System.out.println("Color is white.");
        } else if (color.equalsIgnoreCase("black")) {
            System.out.println("Color is black.");
        } else {
            System.out.println("Truck does not come in that color. "
                    + "Pick a different color");
        }
    }
    
    /**
     * Method to add a specific number of cylinders
     * to the Sport.
     */
    public void cylinders(int cylinder) {
        
        if (cylinder == 2) {
            System.out.println("Cylinder number is 2");
        } else if (cylinder == 4) {
            System.out.println("Cylinder number is 4");
        } else if (cylinder == 6) {
            System.out.println("Cylinder number is 6");
        } else if (cylinder == 8) {
            System.out.println("Cylinder number is 8");
        } else {
            System.out.println("Hybrid does not come with " + cylinder + "cylinder(s), "
                    + "only 2 or 4. Pick a different number of cylinders.");
        }
    }
    
    /**
     * Method to that specifies the transmission type.
     * 1 is automatic. 2 is manual.
     */   
    public void tranmission(int auto) {
        if (auto == 1) {
            System.out.println("\nTransmission is automatic.");
        } else if (auto == 2) {
            System.out.println("\nTransmission is manual.");
        } else {
            System.out.println("Invalid input for transmission. Pick again.");
        }
    }
    
    /**
     * Method to that specifies the tire size.
     * Truck tire size comes in 16-19 inches. 
     */ 
    public void tireSize(int size) {
        if (size == 16) {
            System.out.println("\nTire Size is 16 inches.");
        } else if (size == 17) {
            System.out.println("\nTire Size is 17 inches.");
        } else if (size == 18) {
            System.out.println("\nTTire Size is 18 inches.");
        } else if (size == 19) {
            System.out.println("\nTTire Size is 19 inches.");
        } else {
            System.out.println("Tire size not available for Sport. Pick again..");
        }
        
    }

}
