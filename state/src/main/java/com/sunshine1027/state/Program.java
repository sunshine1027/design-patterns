package com.sunshine1027.state;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Program {
    private TrafficLight state;
    private int greenLimitSecond;
    private int yellowLimitSecond;
    private int redLimitSecond;

    private static final int GREEN_LIMIT_SECOND_DEFAULT = 30;
    private static final int YELLOW_LIMIT_SECOND_DEFAULT = 5;
    private static final int RED_LIMIT_SECOND_DEFAULT = 25;

    private int greenSecondNow = 0;
    private int yellowSecondNow = 0;
    private int redSecondNow = 0;

    public Program() {
        state = new Green();
        greenLimitSecond = GREEN_LIMIT_SECOND_DEFAULT;
        yellowLimitSecond = YELLOW_LIMIT_SECOND_DEFAULT;
        redLimitSecond = RED_LIMIT_SECOND_DEFAULT;
    }
    public Program(TrafficLight state) {
        this.state = state;
        greenLimitSecond = GREEN_LIMIT_SECOND_DEFAULT;
        yellowLimitSecond = YELLOW_LIMIT_SECOND_DEFAULT;
        redLimitSecond = RED_LIMIT_SECOND_DEFAULT;
    }

    public Program(TrafficLight state, int greenLimitSecond, int yellowLimitSecond, int redLimitSecond) {
        this.state = state;
        this.greenLimitSecond = greenLimitSecond;
        this.yellowLimitSecond = yellowLimitSecond;
        this.redLimitSecond = redLimitSecond;
    }

    public void oneSecondCall(int secondTotal) {
        if (state instanceof Green) {
            if (++greenSecondNow == greenLimitSecond) {
                greenSecondNow = 0;
                changeColor(secondTotal);
            } else {
                callPrint(false, secondTotal, Color.GREEN);
            }
        } else if (state instanceof Yellow) {
            if (++yellowSecondNow == yellowLimitSecond) {
                yellowSecondNow = 0;
                changeColor(secondTotal);
            } else {
                callPrint(false, secondTotal, Color.YELLOW);
            }
        } else {
            if (++redSecondNow == redLimitSecond) {
                redSecondNow = 0;
                changeColor(secondTotal);
            } else {
                callPrint(false, secondTotal, Color.RED);
            }
        }
    }

    public void changeColor(int secondTotal) {
        if (state instanceof Green) {
            state.change();
            state = new Yellow(Color.GREEN);
            callPrint(true, secondTotal, Color.GREEN);
        } else if (state instanceof Yellow) {
            state.change();
            if (Color.GREEN.equals(state.getSourceColor())) {
                state = new Red(Color.YELLOW);
            } else {
                state = new Green(Color.YELLOW);
            }
            callPrint(true, secondTotal, Color.YELLOW);
        } else {
            state.change();
            state = new Yellow(Color.RED);
            callPrint(true, secondTotal, Color.RED);
        }

    }

    private void callPrint(boolean isChange, int secondTotal, Color color) {
        if (!isChange) {
            System.out.print("The " + secondTotal + " passed, now is the ");
            switch (color) {
                case RED:
                    System.out.println(redSecondNow + " seconds for red");
                    break;
                case GREEN:
                    System.out.println(greenSecondNow + " seconds for green");
                    break;
                case YELLOW:
                    System.out.println(yellowSecondNow + " seconds for yellow");
                    break;
            }
        } else {
            System.out.println("The " + secondTotal + " color changed");
        }
    }
    public TrafficLight getState() {
        return state;
    }

    public void setState(TrafficLight state) {
        this.state = state;
    }

    public int getGreenLimitSecond() {
        return greenLimitSecond;
    }

    public void setGreenLimitSecond(int greenLimitSecond) {
        this.greenLimitSecond = greenLimitSecond;
    }

    public int getYellowLimitSecond() {
        return yellowLimitSecond;
    }

    public void setYellowLimitSecond(int yellowLimitSecond) {
        this.yellowLimitSecond = yellowLimitSecond;
    }

    public int getRedLimitSecond() {
        return redLimitSecond;
    }

    public void setRedLimitSecond(int redLimitSecond) {
        this.redLimitSecond = redLimitSecond;
    }
}
