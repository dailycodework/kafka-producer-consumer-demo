package com.fixdecode.kafka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Kafka1Application {

    public static void main(String[] args) {
        SpringApplication.run(Kafka1Application.class, args);
    }

   /* @Bean
    CommandLineRunner runner(KafkaTemplate<String, Object> kafkaTemplate){
        return args -> {
            kafkaTemplate.send("users", "Other users were added");
        };
    }*/
}
