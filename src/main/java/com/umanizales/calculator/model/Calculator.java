package com.umanizales.calculator.model;

import com.umanizales.calculator.exception.CalculatorException;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculator {

    public double calculate(String value) throws CalculatorException {
        Expression expression = new ExpressionBuilder(value).build();
        double result = expression.evaluate();

        //if(expression)
        //{
          //  throw new CalculatorException("Syntax Error");
        //}
        //else
        //{
            return result;
        //}
    }
}
