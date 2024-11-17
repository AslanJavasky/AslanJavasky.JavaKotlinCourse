package mod10_design_pattern.lesson13_observer.java;

import java.util.ArrayList;
import java.util.List;

public class Hogwarts implements Subject {

    private List<Observer> observers;
    private String event;

    public Hogwarts() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void setEvent(String event) {
        this.event = event;
        notifyObservers();
    }
}
