package assignment1_part2;

import java.util.Scanner;

class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }6

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double sqrt(double num) {
        return Math.sqrt(num);
    }

    public static double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static double variance(double[] numbers) {
        double mean
                = mean(numbers);
        double sumSquaredDiff = 0;
        for (double num : numbers) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }
        return sumSquaredDiff / numbers.length;
    }
}

