package main.java.builder;

public class HondaCarOrder {
    public String color;
    // public static Model model;
    public ChassisMaterial material;
    public Cylinder cylinder;
    public TireSize tireSize;
    public boolean manual;
    public OrderType orderType;

    public static class HondaCarOrderBuilder {

        public String color;
        // public Model model;
        public ChassisMaterial material;
        public Cylinder cylinder;
        public TireSize tireSize;
        public boolean manual;
        public OrderType orderType;

        /*
         * public HondaCarOrder buildOrder() {
         * 
         * switch(orderType) {
         * 
         * case HYBRID: return new Hybrid(this);
         * 
         * case TRUCK: return new Truck(this);
         * 
         * case SPORT: return new Sport(this);
         * 
         * default: throw new IllegalArgumentException("Uknown Honda Car Type" + model
         * ); }
         * 
         * }
         */

        /**
         * Allows the user to choose the color. Implementation of builder.
         */
        public HondaCarOrderBuilder chooseColor(String color) {

            this.color = color;
            return this;
        }

        /**
         * Allows the user to choose the type of vehicle. Implementation of builder.
         */
        public HondaCarOrderBuilder chooseOrderType(OrderType orderType) {

            this.orderType = orderType;
            return this;
        }

        public HondaCarOrderBuilder chooseChaMaterial(ChassisMaterial material) {
            this.material = material;
            return this;
        }

        public HondaCarOrderBuilder chooseCylinder(Cylinder cylinder) {
            this.cylinder = cylinder;
            return this;
        }

        public HondaCarOrderBuilder chooseTireSize(TireSize tireSize) {
            this.tireSize = tireSize;
            return this;
        }

        public HondaCarOrderBuilder chooseManual(boolean manual) {
            this.manual = manual;
            return this;
        }

        /**
         * Implementation of builder.
         */
        public HondaCarOrder build() {

            HondaCarOrder order = new HondaCarOrder();
            order.color = this.color;
            order.orderType = this.orderType;
            order.material = this.material;
            order.cylinder = this.cylinder;
            order.tireSize = this.tireSize;
            order.manual = this.manual;
            return order;
        }

    }

    /*
     * private HondaCarOrder() { this.model = this.model; this.material =
     * this.material; this.cylinder = this.cylinder; this.tireSize = this.tireSize;
     * this.manual = this.manual; this.color = this.color; }
     */
    @Override
    public String toString() {
        String second;
        if (this.orderType == this.orderType.TRUCK) {
            second = " truck";
        } else if (this.orderType == this.orderType.HYBRID) {
            second = " hybrid";
        } else {
            second = " sport";
        }
        String third;
        if (this.material == this.material.ALUMINUM) {
            third = "\n with an aluminum chassis";
        } else {
            third = "\n with an carbon steel chassis";
        }

        String fourth;
        if (this.cylinder == this.cylinder.TWO) {
            fourth = "\n with two cylinders";
        } else if (this.cylinder == this.cylinder.FOUR) {
            fourth = "\n with four cylinders";
        } else if (this.cylinder == this.cylinder.SIX) {
            fourth = "\n with six cylinders";
        } else {
            fourth = "\n with eight cylinders";
        }
        String five;
        if (this.tireSize == this.tireSize.FOURTEEN) {
            five = "\n with 14 tire size";
        } else if (this.tireSize == this.tireSize.FIFTEEN) {
            five = "\n with 15 tire size";
        } else if (this.tireSize == this.tireSize.SIXTEEN) {
            five = "\n with 16 tire size";
        } else {
            five = "\n with 17 tire size";
        }
        String six;
        if (this.manual == true) {
            six = "\n with a manual transmission";
        } else {
            six = "\n with a automatic transmission";
        }
        return "Car Order: You have a " + this.color + second + third + fourth + five + six;
    }
}
