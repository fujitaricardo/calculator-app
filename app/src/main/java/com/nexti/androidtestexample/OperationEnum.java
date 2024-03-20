package com.nexti.androidtestexample;

public enum OperationEnum {
    ADDITION(0),
    SUBTRACTION(1),
    MULTIPLICATION(2),
    DIVISION(3);

    private Integer value;

    OperationEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
