package com.sunshine1027.interpreter;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class NumberExpression extends Expression{
    private int value;

    public NumberExpression() {
    }

    public NumberExpression(int value) {
        this.value = value;
    }

    public NumberExpression(String stringValue) {
        this.value = Integer.parseInt(stringValue);
    }


    @Override
    public int interpret() {
        return this.value;
    }
}
