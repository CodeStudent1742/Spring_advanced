package com.kodilla.beanlifecycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

//    @Bean
//    public BeanMonitor beanMonitor() {
//        return new BeanMonitor();
//    }
}
