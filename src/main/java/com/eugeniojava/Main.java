package com.eugeniojava;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            printHelp();
            return;
        }
        double result;
        switch (args[0]) {
            case "-h":
            case "--help":
                printHelp();
                break;
            case "add":
            case "div":
            case "mul":
            case "sub":
                result = Calculator.calculate(args[0], Double.parseDouble(args[1]), Double.parseDouble(args[2]));
                System.out.printf("%s %s %s = %s%n", args[1], args[0], args[2], result);
                break;
            default:
                System.out.println("Invalid option: " + args[0]);
                printHelp();
        }
    }

    private static void printHelp() {
        System.out.println("Usage: java -jar <jar-file> [OPTIONS]");
        System.out.println("Options:");
        System.out.println("  -h, --help                           Prints this help message.");
        System.out.println("  add [firstNumber] [secondNumber],    Sum two numbers.");
        System.out.println("  div [firstNumber] [secondNumber],    Subtract two numbers.");
        System.out.println("  mul [firstNumber] [secondNumber],    Multiply two numbers.");
        System.out.println("  sub [firstNumber] [secondNumber],    Divide two numbers.");
    }
}
