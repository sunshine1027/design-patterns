package com.sunshine1027.composite;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Level2Point extends PointComposite{
    private Integer value;

    public Level2Point(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Level2Point{" +
                "value=" + value +
                '}';
    }
}
