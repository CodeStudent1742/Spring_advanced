package com.kodilla.beanlifecycle.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;



@Component
public class CalculationPerformedListener {

    private static final Logger logger = LoggerFactory.getLogger(CalculationPerformedListener.class);

    @EventListener
    public void handleCalculationPerformedEvent(CalculationPerformedEvent event) {
        logger.info("Operation performed: " + event.getOperation());
    }
}
