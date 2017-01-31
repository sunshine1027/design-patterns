package com.sunshine1027.command;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public abstract class Command {
    private Receiver receiver;
    private State state;

    public Command() {
    }

    public Command(Receiver receiver, State state) {
        this.receiver = receiver;
        this.state = state;
    }

    public Command(Receiver receiver) {
        this.receiver = receiver;
        this.state = State.BEGIN;
    }

    public abstract void execute();

    public abstract void rollback();


    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
