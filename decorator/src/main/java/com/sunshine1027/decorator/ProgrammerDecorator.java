package com.sunshine1027.decorator;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ProgrammerDecorator implements IProgrammer{

    private IProgrammer programmer;


    @Override
    public void code() {
        System.out.println("Before coding, I need drink a cup of coffee");
        programmer.code();
        System.out.println("After coding, I need to sleep");
    }

    public ProgrammerDecorator(IProgrammer programmer) {
        this.programmer = programmer;
    }

    public IProgrammer getProgrammer() {
        return programmer;
    }

    public void setProgrammer(IProgrammer programmer) {
        this.programmer = programmer;
    }
}
