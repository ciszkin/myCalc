package by.tms.calcApp.entity;

public class Calculator {

    private Calculator() {}

    public static double mul(double a, double b) {
        return a*b;
    }

    public static double div(double a, double b) {
        return a/b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}