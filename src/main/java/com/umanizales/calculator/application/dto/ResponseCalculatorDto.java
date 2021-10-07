package com.umanizales.calculator.application.dto;

import com.umanizales.calculator.controller.dto.ErrorDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor

/* --implements Serializable-- is not necessary because the Annotation @Data
contains it so that the Objects can travel through the Internet */
public class ResponseCalculatorDto {

    private Object data;
    private String message;
    private List<ErrorDTO> errors;
}

