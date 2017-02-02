package com.sunshine1027.observer;

import java.util.Collections;
import java.util.List;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Phone {
    private State state;
    private List<PhoneObserver> observers;

    public Phone() {
    }

    public Phone(State state, List<PhoneObserver> observers) {
        this.state = state;
        this.observers = observers;
    }

    public void addObserver(PhoneObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PhoneObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        if (observers == null || observers.size() == 0) {
            System.out.println("There is no observer");
        } else {
            for (PhoneObserver observer : observers) {
                observer.update(state);
            }
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<PhoneObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<PhoneObserver> observers) {
        this.observers = observers;
    }
}
