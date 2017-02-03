package com.sunshine1027.state;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public abstract class TrafficLight {
    private Color sourceColor;
    private Color targetColor;

    public TrafficLight() {

    }

    public TrafficLight(Color sourceColor) {
        this.sourceColor = sourceColor;
    }

    public TrafficLight(Color sourceColor, Color targetColor) {
        this.sourceColor = sourceColor;
        this.targetColor = targetColor;
    }

    public abstract void change();

    public Color getSourceColor() {
        return sourceColor;
    }

    public void setSourceColor(Color sourceColor) {
        this.sourceColor = sourceColor;
    }

    public Color getTargetColor() {
        return targetColor;
    }

    public void setTargetColor(Color targetColor) {
        this.targetColor = targetColor;
    }
}
