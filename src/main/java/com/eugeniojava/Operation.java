package com.eugeniojava;

import java.util.Arrays;

public enum Operation {
    ADDITION("add") {
        @Override
        public double apply(double a, double b) {
            return a + b;
        }
    }, DIVISION("div") {
        @Override
        public double apply(double a, double b) {
            return a / b;
        }
    }, MULTIPLICATION("mul") {
        @Override
        public double apply(double a, double b) {
            return a * b;
        }
    }, SUBTRACTION("sub") {
        @Override
        public double apply(double a, double b) {
            return a - b;
        }
    };

    private final String description;

    Operation(String description) {
        this.description = description;
    }

    public static Operation get(String symbol) {
        return Arrays.stream(Operation.values())
                .filter(operation -> operation.description.equals(symbol))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Invalid operation: " + symbol));
    }

    public abstract double apply(double a, double b);
}
