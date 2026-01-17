package de.seuhd.observer;
import java.util.ArrayList;

public abstract class Subject {
    ArrayList<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    void attach(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        if (observers.isEmpty()) {
            return;
        }
        for (Observer o: observers) {
            o.update(this);
        }
    }
}
