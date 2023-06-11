package com.kodilla.events.event;

import org.springframework.context.ApplicationEvent;

public class ProductRegisteredEvent extends ApplicationEvent {
    String productName;
    String otherData;

    public String getProductName() {
        return productName;
    }

    public String getOtherData() {
        return otherData;
    }

    public ProductRegisteredEvent(Object source, String productName, String otherData) {
        super(source);
        this.productName = productName;
        this.otherData = otherData;
    }
}
