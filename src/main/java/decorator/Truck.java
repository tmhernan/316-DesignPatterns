package main.java.decorator;

public class Truck implements CustomCar {
    /**
     * Standard car buider.
     */
    public String customGreeting() {
        String greet = "You've got a Truck!";
        System.out.println(greet);

        return greet;
    }

    /**
     * Standard car buider.
     */
    public TruckMake make(TruckMake m) {

        System.out.print("Ridgeline is available!");

        return m;
    }

    /**
     * Standard car buider.
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
            color = "Truck does not come in that color. " + "Pick a different color";
            System.out.println(color);
        }
        return color;
    }

    /**
     * Standard car buider.
     */
    public int cylinder(int cylinder) {
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
     * Standard car buider.
     */
    public String automatic(boolean auto) {
        String s;
        if (auto == false) {
            s = "Transmission is manual";
        } else {
            s = "Transmission is automatic";
        }
        return s;
    }

    /**
     * Standard car buider.
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

    /**
     * Standard car buider.
     */
    public String chassisMaterial(Chassis material) {
        String c;
        if (material == material.CARBON_STEEL) {
            c = "You've got a carbon steel chassis";
        } else {
            c = "You'be got an aluminium chassis";
        }
        return c;

    }

    @Override
    public void decorate() {
        System.out.println("Car is Truck.");

    }

}
