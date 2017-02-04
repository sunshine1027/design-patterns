package com.sunshine1027.templatemethod;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public abstract class Student {
    public void showLife() {
        eatBreakfast();
        haveClassMorning();
        eatLaunch();
        haveClassAfternoon();
        eatDinner();
        goHome();
    }

    public abstract void eatBreakfast();
    public abstract void haveClassMorning();
    public abstract void eatLaunch();
    public abstract void haveClassAfternoon();
    public abstract void eatDinner();
    public abstract void goHome();
}
