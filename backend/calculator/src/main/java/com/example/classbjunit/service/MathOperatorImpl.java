package com.example.classbjunit.service;

import com.example.classbjunit.dto.DoMathRequest;
import com.example.classbjunit.exception.InvalidOperationException;
import org.springframework.http.ResponseEntity;

public class MathOperatorImpl{
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException {
        if("/".equals(operation) && operand2 == (double) 0){
            throw new InvalidOperationException("Cannot divide by 0");
        }
        switch (operation){
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "**":
                return Math.pow(operand1,operand2);
            case "log":
                return operand1 * Math.log10(operand2);
            case "ln":
                return operand1 * Math.log(operand2);
            default:
                throw new RuntimeException("Unknown operation");
        }
    }

}
