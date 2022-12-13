package com.termone.calculator.controller;

import com.termone.calculator.dto.DoMathRequest;
import com.termone.calculator.exception.InvalidOperationException;
import com.termone.calculator.service.MathOperatorImpl;
import org.springframework.web.bind.annotation.PostMapping;

public class MathController {
    @PostMapping("/calculator")
    public double doMath(DoMathRequest doMathRequest) throws InvalidOperationException {
        MathOperatorImpl mathOperatorImpl = new MathOperatorImpl();
        return mathOperatorImpl.doMath(doMathRequest.getOperand1(),doMathRequest.getOperand2(),doMathRequest.getOperation());
    }
}
