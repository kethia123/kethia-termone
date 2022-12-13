package calculator.src.main.java.com.termone.calculator.controller;

import calculator.src.main.java.com.termone.calculator.dto.DoMathRequest;
import org.springframework.web.bind.annotation.PostMapping;

public class MathController {
    @PostMapping("/calculator")
    public double doMath(DoMathRequest doMathRequest){
//        return MathOperatorImpl.doMath(doMathRequest);
    }
}
