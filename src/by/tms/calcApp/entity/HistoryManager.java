package by.tms.calcApp.entity;

public interface HistoryManager {
    void appendToHistory(String item);
    String[] showHistory();
    String getRecord(int index);
}