package pro.sky.hwjunit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.hwjunit.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final  CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public String doPlus(@RequestParam int num1, int num2) {
        return calculatorService.doPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String doMinus(@RequestParam int num1, int num2) {
        return calculatorService.doMinus(num1, num2);
    }

    @GetMapping("/multiply")
    public String doMultiply(@RequestParam int num1, int num2) {
        return calculatorService.doMultiply(num1, num2);
    }

    @GetMapping("/divide")
    public String doDivide(@RequestParam int num1, int num2) {
        return calculatorService.doDivide(num1, num2);
    }
}
