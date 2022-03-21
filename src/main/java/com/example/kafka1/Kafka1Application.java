package com.example.kafka1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Kafka1Application {

    public static void main(String[] args) {
        SpringApplication.run(Kafka1Application.class, args);
    }
    CommandLineRunner runner(KafkaTemplate<String, Object> kafkaTemplate){
        return args -> {
            kafkaTemplate.send("users", "A new user was added");
            kafkaTemplate.send("users", "Fixing the code");
        };
    }
}
