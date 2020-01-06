package by.tms.calcApp.action;

import by.tms.calcApp.service.AuthService;
import by.tms.calcApp.service.CalcService;
import by.tms.calcApp.util.*;

import static by.tms.calcApp.util.Help.*;

public class CalcAction {

    private CalcService calcService = new CalcService();
    private Reader reader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();
    private AuthService authService = new AuthService();

    public void calculate() {
        writer.write("Enter first number:");
        Double a = getUsersDouble();
        writer.write("a = " + a);
        writer.write("Enter second number:");
        Double b = getUsersDouble();
        writer.write("b = " + b);
        writer.write("Enter desired operation:");
        writer.write("Result: " + checkResult(a, b));
    }

    public void printHistory() {

        for (String s: authService.getCurrentUser().getHistory().showHistory()) {
            writer.write(s);
        }
    }

    private Double checkResult(Double a, Double b) {
        Double result = null;

        while (result == null) {
            String operation = reader.read();
            result = calcService.calc(a, b, operation);

            if(result == null) {
                writer.write("No such operation! Try another one!");
                for (String s: show()) {
                    writer.write(s);
                }
                writer.write("Enter desired operation:");
            }
        }

        if (!authService.getCurrentUser().getLogin().equals("guest")) {
            authService.getCurrentUser().getHistory().appendToHistory(result.toString());
        }

        return result;
    }

    private Double getUsersDouble() {
        Double result = null;
        while (result == null) {
            String tempResult = reader.read();
            if(tempResult.equalsIgnoreCase("u") && !authService.getCurrentUser().getLogin().equals("Guest")) {
                tempResult = authService.getCurrentUser().getHistory().getRecord(0);
            }
            try {
                result = Double.parseDouble(tempResult);
            } catch (Exception e) {
                writer.write("Wrong input! Try again!");
            }
        }

        if (!authService.getCurrentUser().getLogin().equals("guest")) {
            authService.getCurrentUser().getHistory().appendToHistory(result.toString());
        }

        return result;
    }
}
