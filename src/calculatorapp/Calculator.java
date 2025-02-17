package calculatorapp;

public class Calculator {
    // Addition now supports multiple numbers
    public double add(double... numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication now supports multiple numbers
    public double multiply(double... numbers) {
        double result = 1;
        for (double num : numbers) {
            result *= num;
        }
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot calculate modulus with zero");
        }
        return a % b;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(a);
    }
}
