package com.umanizales.calculator.service;

import com.umanizales.calculator.application.dto.ResponseCalculatorDto;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

// Using Lombok Annotations
@Service

// Generating the class with Attributes
public class CalculatorService {
    // Activate the process
    //private Calculator calculator = new Calculator();

    public double calculateExpression(String exp) {
        Expression expression = new ExpressionBuilder(exp).build();
        return expression.evaluate();
    }
    
    // ResponseEntity for methods
    public ResponseEntity<ResponseCalculatorDto> calculate(String exp) 
    {
        return new ResponseEntity<>(new ResponseCalculatorDto(calculateExpression(exp),
                "Successful!", null),HttpStatus.OK);
    }
}
