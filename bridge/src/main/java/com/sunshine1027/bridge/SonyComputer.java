package com.sunshine1027.bridge;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class SonyComputer extends AbstractComputer{

    public SonyComputer() {
    }

    public SonyComputer(IMouse mouse, ICPU cpu) {
        super(mouse, cpu);
    }

    @Override
    public void showComputerMessage() {
        System.out.println("sony computer," + getMouse().showMouse() + "," + getIcpu().showCPU());
    }
}
