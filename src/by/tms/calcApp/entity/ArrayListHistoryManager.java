package by.tms.calcApp.entity;

import java.util.ArrayList;

public class ArrayListHistoryManager implements HistoryManager {
    private ArrayList<String> history;

    public ArrayListHistoryManager() {
        history = new ArrayList<>();
        //Iterator<String> iterator = history.iterator();
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
