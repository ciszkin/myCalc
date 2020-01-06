package by.tms.oop;

public class Car extends AutoTransport {
    private String model;
    private int year;

    public Car(int length, int width, int height, int weight, int numberOfWheels, String brand, String model, int  year) {
        super(length, width, height, weight, numberOfWheels, brand);
        this.model = model;
        this.year = year;

    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
