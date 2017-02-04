package com.sunshine1027.strategy;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class RegularMember extends User{
    @Override
    public void chat() {
        System.out.println("Hello. I'm a regular member.");
    }
}
