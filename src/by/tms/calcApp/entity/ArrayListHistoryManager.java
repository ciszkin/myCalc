package by.tms.calcApp.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayListHistoryManager implements HistoryManager, Serializable {
    private static final long serialVersionUID = 3404936854063961095L;
    private ArrayList<String> history;

    public ArrayListHistoryManager() {
        history = new ArrayList<>();
    }

    @Override
    public void appendToHistory(String item) {
        history.add(0, item);
    }

    @Override
    public String[] showHistory() {
        return history.toArray(new String[0]);
    }

    @Override
    public String getRecord(int index) {
        if(index < history.size()) {
            return history.get(index);
        } else {
            return "Error";
        }
    }
}
