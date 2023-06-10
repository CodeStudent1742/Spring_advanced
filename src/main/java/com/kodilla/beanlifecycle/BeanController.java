package com.kodilla.beanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beans")
public class BeanController {

    private final ConfigurableApplicationContext context;

    public BeanController(ConfigurableApplicationContext context) {
        this.context = context;
    }

    @GetMapping("/create")
    public String createBean() {
        context.getBean(LibraryManager.class);
        return "Bean created";
    }
}