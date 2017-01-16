package com.sunshine1027.bridge;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public abstract class AbstractComputer {
    private IMouse mouse;
    private ICPU icpu;

    public AbstractComputer() {

    }

    public AbstractComputer(IMouse mouse, ICPU cpu) {
        this.mouse = mouse;
        this.icpu = cpu;
    }

    public IMouse getMouse() {
        return mouse;
    }

    public void setMouse(IMouse mouse) {
        this.mouse = mouse;
    }

    public ICPU getIcpu() {
        return icpu;
    }

    public void setIcpu(ICPU icpu) {
        this.icpu = icpu;
    }

    public abstract void showComputerMessage();
}
