package com.fixdecode.kafka1.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

@Configuration
@AllArgsConstructor
public class KafkaListenerConfig {

    ConsumerFactory<String, Object> consumerFactory;

    // kafka Consumer Listener bean
    @Bean
    public KafkaListenerContainerFactory<
        ConcurrentMessageListenerContainer<String, Object>>listenerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, Object> factory
                = new ConcurrentKafkaListenerContainerFactory<String, Object>();
        factory.setConsumerFactory(consumerFactory);
        return factory;
    }

    @KafkaListener(topics = "users", groupId = "groupId")
    public void listener(String data){
        System.out.println("Listener Received "+ data + " :-)");
    }
}
