package at.technikum.slmcalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    private CalculatorController calculatorController = new CalculatorController();     // Klasse erstellen, um zugreifen zu können

    @Test
    public void sumTest1() {
        // Arrange
        int a = 6;
        int b = 11;
        // Act
        int result = calculatorController.sum(a, b);
        // Assert
        assertEquals(17, result);
    }

    @Test
    public void sumTest2() {
        // Arrange
        int a = -6;
        int b = 5;
        // Act
        int result = calculatorController.sum(a, b);
        // Assert
        assertEquals(-1, result);
    }

    @Test
    public void sumTest3() {
        // Arrange
        int a = -5;
        int b = -5;
        // Act
        int result = calculatorController.sum(a, b);
        // Assert
        assertEquals(-10, result);
    }
}