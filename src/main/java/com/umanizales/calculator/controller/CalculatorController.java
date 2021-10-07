package com.umanizales.calculator.controller;

import com.umanizales.calculator.exception.CalculatorException;
import com.umanizales.calculator.exception.DataNotFoundException;
import com.umanizales.calculator.model.Calculator;
import com.umanizales.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


// Using Lombok Annotations...
@RestController
@RequestMapping(path = "calculator")
@Validated
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public @ResponseBody
    ResponseEntity<?> calculate(@Valid @RequestBody String exp) throws CalculatorException {
        return calculatorService.calculate(exp);
    }
}
