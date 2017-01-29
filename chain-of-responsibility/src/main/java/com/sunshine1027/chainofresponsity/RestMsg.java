package com.sunshine1027.chainofresponsity;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class RestMsg {
    private String name;
    private int restHour;
    private LevelType level;

    public RestMsg(String name, int restHour, LevelType level) {
        this.name = name;
        this.restHour = restHour;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRestHour() {
        return restHour;
    }

    public void setRestHour(int restHour) {
        this.restHour = restHour;
    }

    public LevelType getLevel() {
        return level;
    }

    public void setLevel(LevelType level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "RestMsg{" +
                "name='" + name + '\'' +
                ", restHour=" + restHour +
                ", level=" + level +
                '}';
    }
}
