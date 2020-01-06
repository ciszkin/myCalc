package by.tms.oop;

public abstract class AutoTransport  extends GroundTransport implements PlainControllable {
    private String brand;

    public AutoTransport(int length, int width, int height, int weight, int numberOfWheels, String brand) {
        super(length, width, height, weight, numberOfWheels);
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    @Override
    public void voice() {
        System.out.println("AutoTransport");
    }
}
