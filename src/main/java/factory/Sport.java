package main.java.factory;

public class Sport implements CarType {

    @Override
    public String carTypeGreeting() {
        String greet = "You've got a Sport!";
        System.out.println(greet);
        
        return greet;
    } 
    
    /**
     * Method to add a color to the sport. 
     */
    public String color(String color) {
        
        if (color.equalsIgnoreCase("red")) {
            color = "Color is red.";
            System.out.println(color);
        } else if (color.equalsIgnoreCase("blue")) {
            color = "Color is blue";
            System.out.println(color);
        } else if (color.equalsIgnoreCase("yellow")) {
            color = "Color is yellow.";
            System.out.println(color);
        } else {
            color = "\nSport does not come in that color. "
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
            System.out.println("Sport does not come with " + cylinder + "cylinder(s), "
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
     * Hybrid tire size comes in 14,15, 16,17 inches. 
     */ 
    public int tireSize(int size) {
        if (size == 14) {
            System.out.println("Tire Size is 14 inches.");
        } else if (size == 15) {
            System.out.println("Tire Size is 15 inches.");
        } else if (size == 16) {
            System.out.println("TTire Size is 16 inches.");
        } else {
            System.out.println("Tire size not available for Sport. Pick again..");
        }   
        return size;
    }
    
}
