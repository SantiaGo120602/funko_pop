package model.history;

import java.util.ArrayList;

public class HistorySingleton {
    private ArrayList<HistoryEntry> entriesList = new ArrayList<>(); 
    private HistorySingleton() {
    }

    private static class SingletonHolder {
        private static HistorySingleton INSTANCE = new HistorySingleton();
    }

    public static HistorySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void addEntry(HistoryEntry historyEntry) {
        entriesList.add(historyEntry);
    }

    public HistoryEntry getEntry(int index) {
        return entriesList.get(index);
    }

    public HistoryEntry getLastEntry() {
        return entriesList.get(entriesList.size()-1);
    }
}
