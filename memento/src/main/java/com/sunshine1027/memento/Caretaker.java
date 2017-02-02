package com.sunshine1027.memento;

/**
 * A caretaker can manage kinds of memento
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Caretaker {
    private IMemento playMemento;

    public Caretaker() {
    }


    public IMemento getMemento() {
        return playMemento;
    }

    public void setMemento(IMemento memento) {
        this.playMemento = memento;
    }
}
