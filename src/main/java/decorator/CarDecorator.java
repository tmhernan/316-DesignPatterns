package main.java.decorator;

public abstract class CarDecorator implements CustomCar {

    protected CustomCar decoratedCar;

    public CarDecorator(CustomCar decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    public void decorate() {
        decoratedCar.decorate();
    }

}
