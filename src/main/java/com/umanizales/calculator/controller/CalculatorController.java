package com.umanizales.calculator.controller;

import com.umanizales.calculator.exception.CalculatorException;
import com.umanizales.calculator.exception.DataNotFoundException;
import com.umanizales.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


// Using Lombok Annotations...
@RestController
@RequestMapping(path = "calculator")
@Validated
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculate/{value}")
    public @ResponseBody
    ResponseEntity<?> calculate(@PathVariable String value) throws CalculatorException {
        return calculatorService.calculate(value);
    }
}
