package by.tms.oop;

public abstract class Transport implements LineControllable {
    private int length;
    private int width;
    private int height;
    private int weight;

    public Transport() {

    }

    public void voice() {
        System.out.println("Transport");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Transport(int length, int width, int height, int weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}
