package main.java.builder;

public class HondaCarOrder {
    public Door doorType;
    public String color;
    public static Model model;
    public ChassisMaterial material;
    public Cylinder cylinder;
    public TireSize tireSize;
    public boolean manual;
    public Drive driveType;
    public ChargeType chargeType;
    public OrderType orderType;

    public static class HondaCarOrderBuilder {

        public static Door doorType;
        public static String color;
        public static Model model;
        public static ChassisMaterial material;
        public static Cylinder cylinder;
        public static TireSize tireSize;
        public static boolean manual;
        public static Drive driveType;
        public static ChargeType chargeType;
        public static OrderType orderType;

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

            HondaCarOrderBuilder.color = color;
            return this;
        }

        /**
         * Allows the user to choose the type of vehicle. Implementation of builder.
         */
        public HondaCarOrderBuilder chooseOrderType(OrderType orderType) {

            HondaCarOrderBuilder.orderType = orderType;
            return this;
        }

        public HondaCarOrderBuilder chooseChaMaterial(ChassisMaterial material) {
            HondaCarOrderBuilder.material = material;
            return this;
        }

        public HondaCarOrderBuilder chooseCylinder(Cylinder cylinder) {
            HondaCarOrderBuilder.cylinder = cylinder;
            return this;
        }

        public HondaCarOrderBuilder chooseTireSize(TireSize tireSize) {
            HondaCarOrderBuilder.tireSize = tireSize;
            return this;
        }

        public HondaCarOrderBuilder chooseManual(boolean manual) {
            HondaCarOrderBuilder.manual = manual;
            return this;
        }

        /**
         * Implementation of builder.
         */
        public HondaCarOrder build() {

            HondaCarOrder order = new HondaCarOrder();
            order.color = HondaCarOrderBuilder.color;
            order.orderType = HondaCarOrderBuilder.orderType;
            order.material = HondaCarOrderBuilder.material;
            order.cylinder = HondaCarOrderBuilder.cylinder;
            order.tireSize = HondaCarOrderBuilder.tireSize;
            order.manual = HondaCarOrderBuilder.manual;
            return order;
        }

    }

    private HondaCarOrder() {
        this.model = HondaCarOrderBuilder.model;
        this.material = HondaCarOrderBuilder.material;
        this.cylinder = HondaCarOrderBuilder.cylinder;
        this.tireSize = HondaCarOrderBuilder.tireSize;
        this.manual = HondaCarOrderBuilder.manual;
        this.color = HondaCarOrderBuilder.color;
    }

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
