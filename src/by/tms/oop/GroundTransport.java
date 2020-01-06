package by.tms.oop;

public abstract class GroundTransport extends  Transport {
    private int numberOfWheels;

    public GroundTransport() {

    }

    public GroundTransport(int length, int width, int height, int weight, int numberOfWheels) {
        super(length, width, height, weight);
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    @Override
    public void voice() {
        System.out.println("GroundTransport");
    }
}
