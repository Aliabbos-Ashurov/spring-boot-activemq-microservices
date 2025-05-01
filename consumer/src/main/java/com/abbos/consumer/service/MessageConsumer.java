package com.abbos.consumer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Aliabbos Ashurov
 * @version 1.0
 * @since 2025-05-01
 */
@Component
public class MessageConsumer {

    @JmsListener(destination = "testQUEUE") // queue name from producer
    public void consume(String message) {
        System.out.println("received message is:" + message);
    }
}
