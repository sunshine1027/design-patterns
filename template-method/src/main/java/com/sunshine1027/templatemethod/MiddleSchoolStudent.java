package com.sunshine1027.templatemethod;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class MiddleSchoolStudent extends Student{
    @Override
    public void eatBreakfast() {
        System.out.println("middle school student eat breakfast");
    }

    @Override
    public void haveClassMorning() {
        System.out.println("middle school student have class morning");
    }

    @Override
    public void eatLaunch() {
        System.out.println("middle school student eat launch");
    }

    @Override
    public void haveClassAfternoon() {
        System.out.println("middle school student have class afternoon");
    }

    @Override
    public void eatDinner() {
        System.out.println("middle school student eat dinner");
    }

    @Override
    public void goHome() {
        System.out.println("middle school student go home");
    }
}
