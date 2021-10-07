package com.umanizales.calculator.controller;

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
    // exp = expression
    @PostMapping("/calculate")
    public @ResponseBody
    ResponseEntity<?> calculate(@Valid @RequestBody String exp) {
        return calculatorService.calculate(exp);
    }
}
