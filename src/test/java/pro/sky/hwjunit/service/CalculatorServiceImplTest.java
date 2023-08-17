package pro.sky.hwjunit.service;

import org.junit.jupiter.api.Test;
import pro.sky.hwjunit.exception.DivideByNullException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void shouldReturnCorrectMessageAfterAddition() {
        assertEquals("1 + 2 = 3", out.doPlus(1, 2));
        assertEquals("3 + 3 = 6", out.doPlus(3, 3));
    }

    @Test
    public void shouldReturnCorrectMessageAfterSubtraction() {
        assertEquals("1 - 2 = -1", out.doMinus(1, 2));
        assertEquals("3 - 3 = 0", out.doMinus(3, 3));
    }

    @Test
    public void shouldReturnCorrectMessageAfterMultiplication() {
        assertEquals("1 * 2 = 2", out.doMultiply(1, 2));
        assertEquals("3 * 3 = 9", out.doMultiply(3, 3));
    }

    @Test
    public void shouldReturnCorrectMessageAfterDivision() {
        assertEquals("1 / 2 = 0.50", out.doDivide(1, 2));
        assertEquals("3 / 3 = 1.00", out.doDivide(3, 3));
    }

    @Test
    public void shouldReturnException() {
        assertThrows(DivideByNullException.class, () -> out.doDivide(5, 0));
    }
}