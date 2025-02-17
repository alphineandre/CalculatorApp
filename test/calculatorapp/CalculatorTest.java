package calculatorapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(3, calculator.add(1, 2));
        assertEquals(-2, calculator.add(-1, -1));
        assertEquals(15, calculator.add(1, 2, 3, 4, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(4, calculator.subtract(7, 3));
        assertEquals(-8, calculator.subtract(-5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(3, calculator.multiply(1, 3));
        assertEquals(-3, calculator.multiply(-1, 3));
        assertEquals(120, calculator.multiply(1, 2, 3, 4, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(-2.5, calculator.divide(-5, 2));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @Test
    public void testModulus() {
        assertEquals(1, calculator.modulus(7, 3));
        assertEquals(0, calculator.modulus(6, 3));
    }

    @Test
    public void testModulusByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.modulus(7, 0));
    }

    @Test
    public void testPower() {
        assertEquals(8, calculator.power(2, 3));
        assertEquals(1, calculator.power(5, 0));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(3, calculator.squareRoot(9));
        assertEquals(5, calculator.squareRoot(25));
    }

    @Test
    public void testSquareRootNegative() {
        assertThrows(ArithmeticException.class, () -> calculator.squareRoot(-9));
    }
}
