package de.seuhd.observer;
import java.util.ArrayList;


public class ConcreteSubject extends Subject {
    int value_;

    public ConcreteSubject() {
        this.value_ = 0;
    }

    public void setValue(int value) {
        this.value_ = value;
        this.notifyObservers();
    }
}
