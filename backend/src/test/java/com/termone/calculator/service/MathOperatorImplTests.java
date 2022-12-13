package com.termone.calculator.service;

import com.termone.calculator.exception.InvalidOperationException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperatorImplTests {
    @Test
    public void substract_Success() throws InvalidOperationException {
        MathOperatorImpl mathOperatorImpl = new MathOperatorImpl();

        double actualResult = mathOperatorImpl.doMath(9.4,5.2,"-");
        double expectedResult = 4.2;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void add_Success() throws InvalidOperationException {
        MathOperatorImpl mathOperatorImpl = new MathOperatorImpl();

        double actualResult = mathOperatorImpl.doMath(9.5,5.5,"+");
        double expectedResult = 15.0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiply_Success() throws InvalidOperationException {
        MathOperatorImpl mathOperatorImpl = new MathOperatorImpl();

        double actualResult = mathOperatorImpl.doMath(9.4,5.2,"*");
        double expectedResult = 48.88;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divide_Success() throws InvalidOperationException {
        MathOperatorImpl mathOperatorImpl = new MathOperatorImpl();

        double actualResult = mathOperatorImpl.doMath(4.4,2.2,"/");
        double expectedResult = 2.0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void log_Success() throws InvalidOperationException {
        MathOperatorImpl mathOperatorImpl = new MathOperatorImpl();

        double actualResult = mathOperatorImpl.doMath(2.0,1.0,"log");
        double expectedResult = 0.0;
        assertEquals(expectedResult, actualResult);
    }
}
