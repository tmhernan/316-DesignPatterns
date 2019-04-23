package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import main.java.factory.CarType;
import main.java.factory.CarTypeFactory;



public class FactoryTest {
    
    CarTypeFactory factory = new CarTypeFactory();

    @Test
    public void testHybridGreeting() {
        CarType hybrid = factory.getCarType("hybrid");
        String ans = hybrid.carTypeGreeting();
        String ansExpected = "You've got a Hybrid!";
        assertEquals(ans, ansExpected);
    }

    @Test
    public void testHybridColor() {
        CarType hybrid = factory.getCarType("hybrid");
        String ans = hybrid.color("silver");
        String ansExpected = "Color is silver.";
        assertEquals(ans, ansExpected);
        String ans1 = hybrid.color("white");
        String ansExpected1 = "Color is white.";
        assertEquals(ans1, ansExpected1);
    }
    
    @Test
    public void testHybridCylinders() {
        CarType hybrid = factory.getCarType("hybrid");
        int ans = hybrid.cylinders(2);
        int ansExpected = 2;
        assertEquals(ans, ansExpected);
        int ans1 = hybrid.cylinders(3);
        int ansExpected1 = 3;
        assertEquals(ans1, ansExpected1);
    }
    
    @Test
    public void testHybridTireSize() {
        CarType hybrid = factory.getCarType("hybrid");
        int ans = hybrid.tireSize(16);
        int ansExpected = 16;
        assertEquals(ans, ansExpected);
        int ans1 = hybrid.tireSize(77);
        int ansExpected1 = 77;
        assertEquals(ans1, ansExpected1);
    }
    
    @Test
    public void testHybridTransmission() {
        CarType hybrid = factory.getCarType("hybrid");
        int ans = hybrid.tranmission(1);
        int ansExpected = 1;
        assertEquals(ans, ansExpected);
        int ans1 = hybrid.tranmission(2);
        int ansExpected1 = 2;
        assertEquals(ans1, ansExpected1);
    }
    
    @Test
    public void testSportGreeting() {
        CarType sport = factory.getCarType("sport");
        String ans = sport.carTypeGreeting();
        String ansExpected = "You've got a Sport!";
        assertEquals(ans, ansExpected);
    }

    @Test
    public void testSportColor() {
        CarType sport = factory.getCarType("sport");
        String ans = sport.color("red");
        String ansExpected = "Color is red.";
        assertEquals(ans, ansExpected);
        String ans1 = sport.color("green");
        String ansExpected1 =  "\nSport does not come in that color. "
                + "Pick a different color";
        assertEquals(ans1, ansExpected1);
        String ans2 = sport.color("yellow");
        String ansExpected2 =  "Color is yellow.";
        assertEquals(ans2, ansExpected2);
    }
    
    @Test
    public void testSportCylinders() {
        CarType sport = factory.getCarType("sport");
        int ans = sport.cylinders(4);
        int ansExpected = 4;
        assertEquals(ans, ansExpected);
        int ans1 = sport.cylinders(16);
        int ansExpected1 = 16;
        assertEquals(ans1, ansExpected1);
    }
    
    @Test
    public void testSportTireSize() {
        CarType sport = factory.getCarType("sport");
        int ans = sport.tireSize(14);
        int ansExpected = 14;
        assertEquals(ans, ansExpected);
        int ans1 = sport.tireSize(15);
        int ansExpected1 = 15;
        assertEquals(ans1, ansExpected1);
        int ans2 = sport.tireSize(22);
        int ansExpected2 = 22;
        assertEquals(ans2, ansExpected2);
    }
    
    @Test
    public void testSportTransmission() {
        CarType sport = factory.getCarType("sport");
        int ans = sport.tranmission(2);
        int ansExpected = 2;
        assertEquals(ans, ansExpected);
        int ans1 = sport.tranmission(3);
        int ansExpected1 = 3;
        assertEquals(ans1, ansExpected1);
    }
    
    @Test
    public void testTruckGreeting() {
        CarType truck = factory.getCarType("truck");
        String ans = truck.carTypeGreeting();
        String ansExpected = "You've got a Truck!";
        assertEquals(ans, ansExpected);
    }

    @Test
    public void testTruckColor() {
        CarType truck = factory.getCarType("truck");
        String ans = truck.color("silver");
        String ansExpected = "Truck does not come in that color. "
                + "Pick a different color";
        assertEquals(ans, ansExpected);
        String ans1 = truck.color("white");
        String ansExpected1 = "Color is white";
        assertEquals(ans1, ansExpected1);
        String ans2 = truck.color("black");
        String ansExpected2 = "Color is black.";
        System.out.println(ans2 + ansExpected2);
        assertEquals(ans2, ansExpected2);
    }
    
    @Test
    public void testTruckCylinders() {
        CarType truck = factory.getCarType("truck");
        int ans = truck.cylinders(4);
        int ansExpected = 4;
        assertEquals(ans, ansExpected);
        int ans1 = truck.cylinders(10);
        int ansExpected1 = 10;
        assertEquals(ans1, ansExpected1);
        int ans2 = truck.cylinders(8);
        int ansExpected2 = 8;
        assertEquals(ans2, ansExpected2);
    }
    
    @Test
    public void testTruckTireSize() {
        CarType truck = factory.getCarType("truck");
        int ans = truck.tireSize(14);
        int ansExpected = 14;
        assertEquals(ans, ansExpected);
        int ans1 = truck.tireSize(19);
        int ansExpected1 = 19;
        assertEquals(ans1, ansExpected1);
        int ans2 = truck.tireSize(18);
        int ansExpected2 = 18;
        assertEquals(ans2, ansExpected2);
        int ans3 = truck.tireSize(16);
        int ansExpected3 = 16;
        assertEquals(ans3, ansExpected3);
    }
    
    @Test
    public void testTruckTransmission() {
        CarType truck = factory.getCarType("truck");
        int ans = truck.tranmission(2);
        int ansExpected = 2;
        assertEquals(ans, ansExpected);
        int ans1 = truck.tranmission(3);
        int ansExpected1 = 3;
        assertEquals(ans1, ansExpected1);
    }

    
}

    
