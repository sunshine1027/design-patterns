package com.sunshine1027.command;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Invoker {
    private Command command;

    public Invoker() {
    }

    public Invoker(Command command) {
        this.command = command;
    }

    public void runCommand() {
        command.execute();
    }

    public void rollBackCommand() {
        command.rollback();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
