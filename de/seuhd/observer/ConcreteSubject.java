package de.seuhd.observer;
import java.util.ArrayList;


public class ConcreteSubject extends Subject {
    int value_;

    public ConcreteSubject() {
        this.value_ = 0;
    }

    public void setValue(int value) {
        this.value_ = value;
        System.out.printf("Value of subject updated to %o%n", value);
        System.out.printf("Sending update to observers...%n");
        this.notifyObservers();
    }

    @Override
    public int getValue() {
        return value_;
    }
}
