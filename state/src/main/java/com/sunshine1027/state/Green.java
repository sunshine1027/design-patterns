package com.sunshine1027.state;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Green extends TrafficLight{

    public Green() {
    }

    public Green(Color sourceColor) {
        super(sourceColor);
    }

    public Green(Color sourceColor, Color targetColor) {
        super(sourceColor, targetColor);
    }

    @Override
    public void change() {
        setTargetColor(Color.YELLOW);
        System.out.println(String.format("%s -> %s", Color.GREEN.name(), getTargetColor().name()));
    }
}
