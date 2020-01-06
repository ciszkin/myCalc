package by.tms.calcApp.util;

import by.tms.calcApp.util.Writer;

public class ConsoleWriter implements Writer {

    @Override
    public void write(Object message) {
        System.out.println(message.toString());
    }
}
