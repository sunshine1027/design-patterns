package com.sunshine1027.templatemethod;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class CollegeStudent extends Student{
    @Override
    public void eatBreakfast() {
        System.out.println("college student eat breakfast");
    }

    @Override
    public void haveClassMorning() {
        System.out.println("college student have class morning");
    }

    @Override
    public void eatLaunch() {
        System.out.println("college student eat launch");
    }

    @Override
    public void haveClassAfternoon() {
        System.out.println("college student have class afternoon");
    }

    @Override
    public void eatDinner() {
        System.out.println("college student eat dinner");
    }

    @Override
    public void goHome() {
        System.out.println("college student go home");
    }
}
