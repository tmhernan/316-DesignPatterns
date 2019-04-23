package main.java.factory;

public class Truck implements CarType {
    
    @Override
    public String carTypeGreeting() {
        String greet = "You've got a Truck!";
        System.out.println(greet);
        
        return greet;
    } 

    /**
     * Method to add a color to the truck. 
     */
    public String color(String color) {
        
        if (color.equalsIgnoreCase("red")) {
            color = "Color is red";
            System.out.println(color);
        } else if (color.equalsIgnoreCase("white")) {
            color = "Color is white";
            System.out.println(color);
        } else if (color.equalsIgnoreCase("black")) {
            color = "Color is black.";
            System.out.println(color);
        } else {
            color = "Truck does not come in that color. "
                    + "Pick a different color";
            System.out.println(color);
        }
        return color;
    }
    
    /**
     * Method to add a specific number of cylinders
     * to the Sport.
     */
    public int cylinders(int cylinder) {
        
        if (cylinder == 2) {
            System.out.println("Cylinder number is 2");
        } else if (cylinder == 4) {
            System.out.println("Cylinder number is 4");
        } else if (cylinder == 6) {
            System.out.println("Cylinder number is 6");
        } else if (cylinder == 8) {
            System.out.println("Cylinder number is 8");
        } else {
            System.out.println("Truck does not come with " + cylinder + "cylinder(s), "
                    + "only 2 or 4. Pick a different number of cylinders.");
        }
        return cylinder;
    }
    
    /**
     * Method to that specifies the transmission type.
     * 1 is automatic. 2 is manual.
     */   
    public int tranmission(int auto) {
        if (auto == 1) {
            System.out.println("Transmission is automatic.");
        } else if (auto == 2) {
            System.out.println("Transmission is manual.");
        } else {
            System.out.println("Invalid input for transmission. Pick again.");
        }
        return auto;
    }
    
    /**
     * Method to that specifies the tire size.
     * Truck tire size comes in 16-19 inches. 
     */ 
    public int tireSize(int size) {
        if (size == 16) {
            System.out.println("Tire Size is 16 inches.");
        } else if (size == 17) {
            System.out.println("Tire Size is 17 inches.");
        } else if (size == 18) {
            System.out.println("TTire Size is 18 inches.");
        } else if (size == 19) {
            System.out.println("Tire Size is 19 inches.");
        } else {
            System.out.println("Tire size not available for Truck. Pick again..");
        }
        return size;
    }

}
