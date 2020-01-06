package by.tms.calcApp.entity;

import java.util.Arrays;

public class ArrayHistoryManager implements HistoryManager {
    private String[] history;

    public ArrayHistoryManager(int size) {
        history = new String[size];
        Arrays.fill(history, "");
    }

    @Override
    public void appendToHistory(String item) {
        for(int i = history.length - 1; i > 0; i--) {
            if(history[i - 1].compareTo("") != 0) {
                history[i] = history[i - 1];
            }
        }
        history[0] = item;
    }

    @Override
    public String[] showHistory() {
        return history;
    }

    @Override
    public String getRecord(int index) {
        if(index < history.length) {
            return history[index];
        } else {
            return "Error";
        }
    }
}
