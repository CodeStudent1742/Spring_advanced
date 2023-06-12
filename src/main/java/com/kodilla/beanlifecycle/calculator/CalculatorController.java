package com.kodilla.beanlifecycle.calculator;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final ApplicationEventPublisher eventPublisher;

    public CalculatorController(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @GetMapping("/add")
    public double add(@RequestParam double a, @RequestParam double b) {
        double result = a + b;
        eventPublisher.publishEvent(new CalculationPerformedEvent(this, "add"));
        return result;
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        double result = a - b;
        eventPublisher.publishEvent(new CalculationPerformedEvent(this, "subtract"));
        return result;
    }

    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        double result = a * b;
        eventPublisher.publishEvent(new CalculationPerformedEvent(this, "multiply"));
        return result;
    }

    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        double result = a / b;
        eventPublisher.publishEvent(new CalculationPerformedEvent(this, "divide"));
        return result;
    }
}
