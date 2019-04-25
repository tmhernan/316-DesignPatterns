package main.java;

import main.java.builder.ChassisMaterial;
import main.java.builder.Cylinder;
import main.java.builder.HondaCarOrder;
import main.java.builder.OrderType;
import main.java.builder.TireSize;
import main.java.decorator.CustomCar;
import main.java.decorator.Hybrid;
import main.java.decorator.Navigation;
import main.java.decorator.Sensing;
import main.java.decorator.Truck;
import main.java.factory.CarType;
import main.java.factory.CarTypeFactory;

public class Main {

    /**
     * Main.
     */
    public static void main(String[] args) {

        // Factory pattern needs just one instantiation
        // and can produce many types from this- 3 in
        // this example
        CarTypeFactory factory = new CarTypeFactory();

        System.out.println("Factory Pattern: \n");
        System.out.println("Your car: \n");
        CarType hybrid = factory.getCarType("hybrid");
        hybrid.carTypeGreeting();
        hybrid.color("silver");
        hybrid.cylinders(2);
        hybrid.tireSize(16);
        hybrid.tranmission(1);

        System.out.println("\nYour car: ");
        CarType sport = factory.getCarType("sport");
        sport.carTypeGreeting();
        sport.color("red");
        sport.cylinders(4);
        sport.tireSize(14);
        sport.tranmission(2);

        System.out.println("\nYour car: ");
        CarType truck = factory.getCarType("truck");
        truck.carTypeGreeting();
        truck.color("silver");
        truck.cylinders(2);
        truck.tireSize(16);
        truck.tranmission(1);

        System.out.println("\nBuilder Pattern: \n");

        HondaCarOrder firstOrder = new HondaCarOrder.HondaCarOrderBuilder().chooseColor("red")
                .chooseOrderType(OrderType.TRUCK)
                .chooseChaMaterial(ChassisMaterial.ALUMINUM)
                .chooseManual(true)
                .chooseCylinder(Cylinder.TWO)
                .chooseTireSize(TireSize.FIFTEEN)
                .build();

        System.out.println(firstOrder + "\n");

        HondaCarOrder secondOrder = new HondaCarOrder.HondaCarOrderBuilder()
                .chooseColor("yellow")
                .chooseOrderType(OrderType.HYBRID)
                .chooseChaMaterial(ChassisMaterial.ALUMINUM)
                .chooseManual(true)
                .chooseCylinder(Cylinder.SIX)
                .chooseTireSize(TireSize.SEVENTEEN)
                .build();

        System.out.println(secondOrder);

        System.out.println("\nDecorator Pattern: \n");

        CustomCar carHybridSensor = new Sensing(new Hybrid());
        carHybridSensor.decorate();

        CustomCar carHybridNavigationSen = new Sensing(new Navigation(new Hybrid()));
        carHybridNavigationSen.decorate();

        CustomCar carTruckSensor = new Sensing(new Truck());
        carTruckSensor.decorate();

        CustomCar carTruckSensorNavigation = new Sensing(new Navigation(new Hybrid()));
        carTruckSensorNavigation.decorate();

        CustomCar carSportSensor = new Sensing(new Truck());
        carSportSensor.decorate();
    }

}
