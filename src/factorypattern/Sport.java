package factorypattern;

public class Sport implements CarType {

    @Override
    public void carTypeGreeting() {
        System.out.println("You've got a Sport!");
        
    } 
    
    /**
     * Method to add a color to the sport. 
     */
    public void color(String color) {
        
        if (color.equalsIgnoreCase("red")) {
            System.out.println("Color is red.");
        } else if (color.equalsIgnoreCase("blue")) {
            System.out.println("Color is blue.");
        } else if (color.equalsIgnoreCase("yellow")) {
            System.out.println("Color is yellow.");
        } else {
            System.out.println("\nSport does not come in that color. "
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
            System.out.println("Sport does not come with " + cylinder + "cylinder(s), "
                    + "only 2 or 4. Pick a different number of cylinders.");
        }
    }
    
    /**
     * Method to that specifies the transmission type.
     * 1 is automatic. 2 is manual.
     */   
    public void tranmission(int auto) {
        if (auto == 1) {
            System.out.println("Transmission is automatic.");
        } else if (auto == 2) {
            System.out.println("Transmission is manual.");
        } else {
            System.out.println("Invalid input for transmission. Pick again.");
        }
    }
    
    /**
     * Method to that specifies the tire size.
     * Hybrid tire size comes in 14,15, 16,17 inches. 
     * @param an int that specifies tire size.
     */ 
    public void tireSize(int size) {
        if (size == 14) {
            System.out.println("Tire Size is 14 inches.");
        } else if (size == 15) {
            System.out.println("Tire Size is 15 inches.");
        } else if (size == 16) {
            System.out.println("TTire Size is 16 inches.");
        } else {
            System.out.println("Tire size not available for Sport. Pick again..");
        }    
    }
    
}
