package main.java.decorator;

public class Sport implements CustomCar {
    /**
     * Standard car buider.
     */
    public String customGreeting() {
        String greet = "You've got a Sport!";
        System.out.println(greet);

        return greet;
    }

    /**
     * Standard car buider.
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
            color = "\nSport does not come in that color. " + "Pick a different color";
            System.out.println(color);
        }
        return color;
    }

    /**
     * Standard car buider.
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
            c = "You'be got an aluminium chassis";
        }
        return c;

    }

    /**
     * Standard car buider.
     */
    public SportMake make(SportMake m) {
        if (m == m.ACURA_NSX) {
            System.out.print("You've got a Acura NSX");
        } else if (m == m.CIVIC_COUP) {
            System.out.print("You've got a Civic Coupe");
        } else if (m == m.CIVIC_R) {
            System.out.println("You've got an Civic R");
        } else {
            System.out.println("Youve got a Civic Si Coupe");
        }

        return m;
    }

    @Override
    public void decorate() {
        System.out.println("Car is Sport");
    }
}
