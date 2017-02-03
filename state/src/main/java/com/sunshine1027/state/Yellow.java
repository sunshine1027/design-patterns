package com.sunshine1027.state;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Yellow extends TrafficLight{

    public Yellow() {
    }

    public Yellow(Color sourceColor) {
        super(sourceColor);
    }

    public Yellow(Color sourceColor, Color targetColor) {
        super(sourceColor, targetColor);
    }

    @Override
    public void change() {
        //green -> yellow
        if (Color.GREEN.equals(getSourceColor())) {
            setTargetColor(Color.RED);
        } else {
            setTargetColor(Color.GREEN);
        }
        System.out.println(String.format("%s -> %s", Color.YELLOW.name(), getTargetColor().name()));
    }

}
