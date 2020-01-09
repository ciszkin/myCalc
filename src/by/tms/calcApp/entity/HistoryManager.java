package by.tms.calcApp.entity;

import java.io.Serializable;

public interface HistoryManager extends Serializable {
    void appendToHistory(String item);
    String[] showHistory();
    String getRecord(int index);
}