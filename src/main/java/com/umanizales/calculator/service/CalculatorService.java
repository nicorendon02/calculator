package com.umanizales.calculator.service;

import com.umanizales.calculator.application.dto.ResponseCalculatorDto;
import com.umanizales.calculator.exception.CalculatorException;
import com.umanizales.calculator.model.Calculator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

// Using Lombok Annotations
@Service

// Generating the class with Attributes
public class CalculatorService {
    // Activate the process
    private Calculator calculator = new Calculator();

    // ResponseEntity for methods
    public ResponseEntity<ResponseCalculatorDto> calculate(String value) throws CalculatorException
    {

        return new ResponseEntity<>(new ResponseCalculatorDto(calculator.calculate(value),
                "Boy added correctly!", null),HttpStatus.OK);
    }
}
