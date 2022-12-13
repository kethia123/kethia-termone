package com.termone.calculator.dto;


import javax.validation.constraints.NotNull;

public class DoMathRequest {
    @NotNull
    private double operand1;
    @NotNull
    private double operand2;
    @NotNull
    private String operation;

    public DoMathRequest(){
        super();
    }
    public DoMathRequest(@NotNull double operand1, @NotNull double operand2, @NotNull String operation) {
        super();
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}

