package factorypattern;

public class CarTypeFactory {
   
    /**
     * Primary method for the factory pattern. 
     * Initializes many objects that fall under
     * car type.
     */
    public CarType getCarType(String carType) {
        
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("HYBRID")) {
            return new Hybrid();
        }
        if (carType.equalsIgnoreCase("SPORT")) {
            return new Sport();
        }
        if (carType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        }      
        
        return null;       
    }
}
