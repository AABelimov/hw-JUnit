package pro.sky.hwjunit.service;

import org.springframework.stereotype.Service;
import pro.sky.hwjunit.exception.DivideByNullException;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String doPlus(int a, int b) {
        return String.format("%d + %d = %d", a, b, a + b);
    }

    @Override
    public String doMinus(int a, int b) {
        return String.format("%d - %d = %d", a, b, a - b);
    }

    @Override
    public String doMultiply(int a, int b) {
        return String.format("%d * %d = %d", a, b, a * b);
    }

    @Override
    public String doDivide(int a, int b) {
        if (b == 0) {
            throw new DivideByNullException("Can't divide by zero");
        }
        return String.format("%d / %d = %.2f", a, b, (double)a / b);
    }
}
