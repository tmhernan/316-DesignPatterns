package main.java;

import factorypattern.CarType;
import factorypattern.CarTypeFactory;

public class Main {

    /**
     * Main.
     */
    public static void main(String[] args) {
       
        CarTypeFactory factory = new CarTypeFactory();
        
        System.out.println("Your car: \n");
        CarType hybridA = factory.getCarType("hybrid");
        hybridA.carTypeGreeting();
        hybridA.color("silver");
        hybridA.cylinders(2);
        hybridA.tireSize(16);
        hybridA.tranmission(1);
        

    }

}
