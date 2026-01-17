package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    Subject subject_;

    public ConcreteObserver(Subject subject) {
        subject_ = subject;
        subject_.attach(this);
    }

    @Override
    public void update(Subject subject) {
        subject_ = subject;
    }

    public void detach() {
        subject_.detach(this);
    }
}
