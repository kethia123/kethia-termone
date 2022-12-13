package com.termone.calculator.service;

import com.termone.calculator.exception.InvalidOperationException;

public interface MathOperator {
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
