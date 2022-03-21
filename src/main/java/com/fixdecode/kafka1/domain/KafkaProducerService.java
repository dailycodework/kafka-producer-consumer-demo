package com.fixdecode.kafka1.domain;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaProducerService {

    private KafkaTemplate<String, Object> kafkaTemplate;
    public void publishMessage(MessageRequest message) {
        kafkaTemplate.send("users", message.message());
    }
}
