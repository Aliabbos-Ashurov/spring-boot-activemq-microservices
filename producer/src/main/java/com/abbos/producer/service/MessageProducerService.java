package com.abbos.producer.service;

import com.abbos.producer.producer.MessageProducer;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 * @author Aliabbos Ashurov
 * @version 1.0
 * @since 2025-05-01
 */
@Service
public class MessageProducerService {

    private final MessageProducer producer;

    public MessageProducerService(MessageProducer producer) {
        this.producer = producer;
    }

    public void send(@NonNull String message) {
        producer.sendMessage(message);
    }
}
