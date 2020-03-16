package com.codeinvestigator.kafkaconsumer.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mykafka")
@Data
public class MyKafkaProperties {
    public static final String CONSUMER_GROUP_ID = "mikesconsumergroup";
    private String bootstrapAddress;

}
