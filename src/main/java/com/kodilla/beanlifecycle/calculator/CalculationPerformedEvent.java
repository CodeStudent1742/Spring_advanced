package com.kodilla.beanlifecycle.calculator;

import org.springframework.context.ApplicationEvent;

public class CalculationPerformedEvent extends ApplicationEvent {
    private final String operation;

    public CalculationPerformedEvent(Object source, String operation) {
        super(source);
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
