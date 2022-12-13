package com.example.classbjunit.controller;

import com.example.classbjunit.dto.DoMathRequest;
import com.example.classbjunit.service.MathOperatorImpl;
import org.springframework.web.bind.annotation.PostMapping;

public class MathController {
    @PostMapping("/calculator")
    public double doMath(DoMathRequest doMathRequest){
//        return MathOperatorImpl.doMath(doMathRequest);
    }
}
