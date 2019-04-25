package main.java.decorator;

public class Navigation extends CarDecorator {

    public Navigation(CustomCar decoratedCar) {
        super(decoratedCar);
        // TODO Auto-generated constructor stub
    }

    public void decorate() {
        decoratedCar.decorate();
        addNavigation(decoratedCar);
    }

    @Override
    public String customGreeting() {
        // TODO Auto-generated method stub
        return null;
    }

    private void addNavigation(CustomCar decoratedCar) {
        System.out.println("Custom add-on: Navigation, an assistive technology.");
    }

}
