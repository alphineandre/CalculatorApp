package calculatorapp;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition: " + calculator.add(1, 2, 3, 4, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiplication: " + calculator.multiply(1, 2, 3, 4, 5));
        System.out.println("Division: " + calculator.divide(6, 2));
        System.out.println("Modulus: " + calculator.modulus(10, 3));
        System.out.println("Power: " + calculator.power(2, 3));
        System.out.println("Square Root: " + calculator.squareRoot(25));
    }
}
