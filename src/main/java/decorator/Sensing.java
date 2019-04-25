package main.java.decorator;

public class Sensing extends CarDecorator {

    public Sensing(CustomCar decoratedCar) {
        super(decoratedCar);

    }

    /**
     * Standard car buider.
     */
    public void decorate() {
        decoratedCar.decorate();
        addSensor(decoratedCar);

    }

    @Override
    public String customGreeting() {

        return null;
    }

    private void addSensor(CustomCar decoratedCar) {
        System.out.println("Custom add-on: Sensing Standard, a safety assistive technology.");
    }

}
