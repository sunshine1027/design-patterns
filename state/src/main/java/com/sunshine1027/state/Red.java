package com.sunshine1027.state;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Red extends TrafficLight{

    public Red() {
    }

    public Red(Color sourceColor) {
        super(sourceColor);
    }

    public Red(Color sourceColor, Color targetColor) {
        super(sourceColor, targetColor);
    }

    @Override
    public void change() {
        setTargetColor(Color.YELLOW);
        System.out.println(String.format("%s -> %s", Color.RED.name(), getTargetColor().name()));
    }
}
