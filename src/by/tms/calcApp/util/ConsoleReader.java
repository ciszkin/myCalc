package by.tms.calcApp.util;

import by.tms.calcApp.util.Reader;

import java.util.Scanner;

public class ConsoleReader implements Reader {
    Scanner scan = new Scanner(System.in);

    @Override
    public String read() {
        return scan.nextLine();
    }

}
