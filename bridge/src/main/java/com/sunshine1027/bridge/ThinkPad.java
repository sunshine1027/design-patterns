package com.sunshine1027.bridge;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class ThinkPad extends AbstractComputer{

    public ThinkPad() {
    }

    public ThinkPad(IMouse mouse, ICPU cpu) {
        super(mouse, cpu);
    }

    @Override
    public void showComputerMessage() {
        System.out.println("ThinkPad computer," + getMouse().showMouse() + "," + getIcpu().showCPU());
    }
}
