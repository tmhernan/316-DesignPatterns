package test.java;

import static org.junit.Assert.assertEquals;

import main.java.builder.ChassisMaterial;
import main.java.builder.Cylinder;
import main.java.builder.HondaCarOrder;
import main.java.builder.OrderType;
import main.java.builder.TireSize;

import org.junit.Test;



public class BuilderTest {



    @Test
    public void testFirstBuild() {
        HondaCarOrder firstOrder = new HondaCarOrder.HondaCarOrderBuilder()
                .chooseColor("red")
                .chooseOrderType(OrderType.TRUCK)
                .chooseChaMaterial(ChassisMaterial.ALUMINUM)
                .chooseManual(true)
                .chooseCylinder(Cylinder.TWO)
                .chooseTireSize(TireSize.FIFTEEN)
                .build();
        String ans = firstOrder.toString();
        System.out.println(ans);
        String ansExpected = "Car Order: You have a red truck"
                + "\n with an aluminum chassis"
                + "\n with two cylinders"
                + "\n with 15 tire size"
                + "\n with a manual transmission";
        System.out.println(ansExpected);
        assertEquals(ans, ansExpected);
    }

    @Test   
    public void testSecondBuild() {

        HondaCarOrder secondOrder = new HondaCarOrder.HondaCarOrderBuilder()
                .chooseColor("yellow")
                .chooseOrderType(OrderType.HYBRID)
                .chooseChaMaterial(ChassisMaterial.CARBON_STEEL)
                .chooseManual(false)
                .chooseCylinder(Cylinder.SIX)
                .chooseTireSize(TireSize.SEVENTEEN)
                .build();
        String ans = secondOrder.toString();
        System.out.println(ans);
        String ansExpected = "Car Order: You have a yellow hybrid"
                + "\n with an carbon steel chassis"
                + "\n with six cylinders"
                + "\n with 17 tire size"
                + "\n with a automatic transmission";
        System.out.println(ansExpected);
        assertEquals(ans, ansExpected);

       
       
    }

}
