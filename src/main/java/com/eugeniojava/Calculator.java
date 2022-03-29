package com.eugeniojava;

public final class Calculator {
    private Calculator() {
    }

    public static double calculate(String description, double a, double b) {
        return Operation.get(description).apply(a, b);
    }
}
