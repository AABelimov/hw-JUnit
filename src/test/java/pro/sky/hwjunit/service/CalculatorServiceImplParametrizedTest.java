package pro.sky.hwjunit.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    public void shouldReturnCorrectValue(String operation, int val1, int val2, String message) {
        switch (operation) {
            case "plus":
                assertEquals(message, out.doPlus(val1, val2));
                break;
            case "minus":
                assertEquals(message, out.doMinus(val1, val2));
                break;
            case "multiply":
                assertEquals(message, out.doMultiply(val1, val2));
                break;
            case "divide":
                assertEquals(message, out.doDivide(val1, val2));
                break;
        }
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of("plus", 1, 2, "1 + 2 = 3"),
                Arguments.of("plus", 3, 3, "3 + 3 = 6"),
                Arguments.of("minus", 1, 2, "1 - 2 = -1"),
                Arguments.of("minus", 3, 3, "3 - 3 = 0"),
                Arguments.of("multiply", 1, 2, "1 * 2 = 2"),
                Arguments.of("multiply", 3, 3, "3 * 3 = 9"),
                Arguments.of("divide", 1, 2, "1 / 2 = 0.50"),
                Arguments.of("divide", 3, 3, "3 / 3 = 1.00")
                );
    }
}