package by.tms.calcApp;

import by.tms.calcApp.action.*;
import by.tms.calcApp.util.*;

import static by.tms.calcApp.util.Help.show;

public class ConsoleApp implements App {
    private Reader reader = new ConsoleReader();
    private Writer writer = new ConsoleWriter();
    private boolean isRunning = false;

    private UserAction userAction = new UserAction();
    private CalcAction calcAction = new CalcAction();

    public ConsoleApp() {   }

    public static void main(String[] args) {
        App app = new ConsoleApp();
        app.run();
    }

    @Override
    public void run() {
        isRunning = true;

        for (String s : show()) {
            writer.write(s);
        }

        userAction.init();

        while(isRunning) {
            update();
        }
    }

    @Override
    public void stop() {

        isRunning = false;
        userAction.end();
    }

    private void update() {

        writer.write("Enter command:");
        String answer = reader.read().toLowerCase();
        switch (answer) {
            case "e"://exit
                stop();
                break;
            case "ed":
                userAction.editProfile();
                break;
            case "h"://help
                for (String s : show()) {
                    writer.write(s);
                }
                break;
            case "lo"://logout
                userAction.logOut();
                break;
            case "li"://login
                userAction.logIn();
                break;
            case "reg"://registration
                userAction.register();
                break;
            case "his"://history
                writer.write("History of entered numbers and obtained results:");
                calcAction.printHistory();
                break;
            default://calculations
                calcAction.calculate();
                break;
        }
    }
}