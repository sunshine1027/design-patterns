package com.sunshine1027.command;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class BuyCommand extends Command {
    public BuyCommand() {
    }

    public BuyCommand(Receiver receiver, State state) {
        super(receiver, state);
    }

    public BuyCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        State state = getState();
        Receiver receiver = getReceiver();
        if (State.BEGIN.equals(state)) {
            receiver.execute();
        } else {
            System.out.println("This state can not execute,state=" + state.name());
        }
        //To test rollback, set state 'doing' here.
        setState(State.DOING);
    }

    @Override
    public void rollback() {
        State state = getState();
        Receiver receiver = getReceiver();
        if (!State.DONE.equals(state)) {
            receiver.rollback();
        } else {
            System.out.println("This state can not rollback,state=" + state.name());
        }
        setState(State.BEGIN);
    }
}
