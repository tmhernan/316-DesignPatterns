package main.java.decorator;

public class Hybrid implements CustomCar {

    /**
     * Standard car buider.
     */
    public String customGreeting() {
        String greet = "You've got a Hybrid!";
        System.out.println(greet);

        return greet;
    }

    /**
     * Standard car buider.
     */
    public HybridMake make(HybridMake m) {
        if (m == m.ACCORD_ELEC) {
            System.out.print("You've got a Accord Hybrid");
        } else if (m == m.CLARITY_PLUG) {
            System.out.print("You've got a Clarity Plug-In Hybrid");
        } else {
            System.out.println("You've got an Insight");
        }

        return m;
    }

    /**
     * Standard car buider.
     */
    public String color(String color) {
        if (color.equalsIgnoreCase("silver")) {
            color = "Color is silver.";
            System.out.println(color);
        } else if (color.equalsIgnoreCase("white")) {
            color = "Color is white.";
            System.out.println(color);
        } else {
            color = "Hybrid does not come in that color. Order again";
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
        } else {
            System.out.println("null");
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
        if (size == 15) {
            System.out.println("Tire Size is 15 inches.");
        } else if (size == 16) {
            System.out.println("Tire Size is 16 inches.");
        } else if (size == 17) {
            System.out.println("Tire Size is 17 inches.");
        } else {
            System.out.println("Tire size not available for Hybrid. Pick again.");
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
            c = "Hybrid does not come in that material.";
        }
        return c;

    }

    @Override
    public void decorate() {
        System.out.println("Car is Hybrid.");

    }

}
