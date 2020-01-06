package by.tms.oop;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(4018, 1720, 1498, 1605,
                4,
                "Ford",
                "Fusion", 2007);

        //System.out.println("My car is " + myCar.getBrand() + " " + myCar.getModel() + " " + myCar.getYear());
        //System.out.print("It has " + myCar.getNumberOfWheels() + " wheels");
        //System.out.println("and weights " + myCar.getWeight() + " kg.");

        ((Transport)myCar).voice();

    }
}
