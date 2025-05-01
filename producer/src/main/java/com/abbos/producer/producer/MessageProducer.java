package com.abbos.producer.producer;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Aliabbos Ashurov
 * @version 1.0
 * @since 2025-05-01
 */
@Component
public class MessageProducer {

    private static final String QUEUE_NAME = "testQUEUE";
    private final JmsTemplate jmsTemplate;

    public MessageProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(QUEUE_NAME, message);
        System.out.println("Message sent: " + message);
    }
}
