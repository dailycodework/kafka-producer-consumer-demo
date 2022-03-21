package com.fixdecode.kafka1.domain;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/producer")
@AllArgsConstructor
public class MessageProducerController {

    private KafkaProducerService producerService;
    @PostMapping
    public void publishMessage(@RequestBody MessageRequest message){
        producerService.publishMessage(message);
    }
}
