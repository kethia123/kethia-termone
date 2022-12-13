package com.example.classbjunit.service;

import com.example.classbjunit.exception.InvalidOperationException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperatorImplTests {
    @Test
    public void doMath_Success() {
        MathOperatorImpl mathOperatorImpl = new MathOperatorImpl();

        double actualResult = mathOperatorImpl.doMath(9.4,5.2,"-");
        double expectedResult = 4.2;
        assertEquals(expectedResult, actualResult);
    }
}
