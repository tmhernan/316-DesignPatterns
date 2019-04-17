package main.java;

public class Main {

    /**
     * Main.
     */
    public static void main(String[] args) {
       
        //Factory pattern needs just one instantiation
        //and can produce many types from this- 3 in
        //this example
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
    }

}
