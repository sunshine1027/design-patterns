package com.sunshine1027.interpreter;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public enum Operator {
    PLUS("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private String operator;

    Operator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public static Operator getOperatorByName(String operator) {
        switch (operator) {
            case "+":
                return PLUS;
            case "-":
                return SUBTRACT;
            case "*":
                return MULTIPLY;
            case "/":
                return DIVIDE;
            default:
                return PLUS;
        }
    }
}
