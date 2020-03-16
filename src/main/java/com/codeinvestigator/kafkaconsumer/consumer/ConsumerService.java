package com.codeinvestigator.kafkaconsumer.consumer;

import com.codeinvestigator.kafkaconsumer.config.MyKafkaProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConsumerService {

    @KafkaListener(topics = {"mike"}, groupId = MyKafkaProperties.CONSUMER_GROUP_ID)
    public void consumeMessages(String message){
      log.info("CONSUMER: We received a message!!! {}", message);
    }
}
