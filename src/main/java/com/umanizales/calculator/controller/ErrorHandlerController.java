package com.umanizales.calculator.controller;

import com.umanizales.calculator.application.dto.ResponseCalculatorDto;
import com.umanizales.calculator.controller.dto.ErrorDTO;
import com.umanizales.calculator.exception.CalculatorException;
import com.umanizales.calculator.exception.DataNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ErrorHandlerController {

    @ExceptionHandler(DataNotFoundException.class)
    protected ResponseEntity<?> handle(DataNotFoundException ex) {

        List<ErrorDTO> errorsNotFound = new ArrayList<>();
        errorsNotFound.add(new ErrorDTO(HttpStatus.NOT_FOUND.value(), ex.getMessage()));
        String message = "There is no data";
        ResponseCalculatorDto response = new ResponseCalculatorDto(null, message, errorsNotFound);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CalculatorException.class)
    protected ResponseEntity<?> handle(CalculatorException ex) {

        List<ErrorDTO> errors = new ArrayList<>();
        errors.add(new ErrorDTO(HttpStatus.CONFLICT.value(), ex.getMessage()));
        String message = "A logic failure has occurred!";
        ResponseCalculatorDto response = new ResponseCalculatorDto(null, message, errors);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<?> handle(IllegalArgumentException ex) {

        List<ErrorDTO> errors = new ArrayList<>();
        errors.add(new ErrorDTO(HttpStatus.CONFLICT.value(), ex.getMessage()));
        String message = "A logic failure has occurred!";
        ResponseCalculatorDto response = new ResponseCalculatorDto(null, message, errors);
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

}
