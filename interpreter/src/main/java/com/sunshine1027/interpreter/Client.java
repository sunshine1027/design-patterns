package com.sunshine1027.interpreter;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Stack;

import static com.sunshine1027.interpreter.Operator.*;

/**
 * @author sunshine1027 [sunshine10271993@gmail.com]
 */

public class Client {
    public int calculate(String context) {
        List<String> expressionList = Lists.newArrayList(context.split(" "));
        Stack<Expression> stack = new Stack<>();
        for (String s : expressionList) {
            if (isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = getOperatorExpression(s, leftExpression, rightExpression);
                int result = operator != null ? operator.interpret() : 0;
                NumberExpression resultExpression = new NumberExpression(result);
                stack.push(resultExpression);
            } else {
                Expression i = new NumberExpression(s);
                stack.push(i);
            }
        }
        return stack.pop().interpret();
    }

    private Expression getOperatorExpression(String s, Expression leftExpression, Expression rightExpression) {
        Operator operator = Operator.getOperatorByName(s);
        switch (operator) {
            case PLUS:
                return new PlusExpression(leftExpression, rightExpression);
            case SUBTRACT:
                return new SubtractExpression(leftExpression, rightExpression);
            case DIVIDE:
                return new DivideExpression(leftExpression, rightExpression);
            case MULTIPLY:
                return new MultiplyExpression(leftExpression, rightExpression);
            default:
                return null;
        }
    }

    private boolean isOperator(String subString) {
        return getAllOperator().contains(subString);
    }

    private List<String> getAllOperator() {
        List<String> operatorList = Lists.newArrayList();
        Operator[] operators = values();
        for (Operator operator : operators) {
            operatorList.add(operator.getOperator());
        }
        return operatorList;
    }
}
