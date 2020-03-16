# Kafka Consumer
## Spring Configuration
<pre>
@EnableKafka
</pre>
### Consumer factory

<pre>
props.put(
                    ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                    myKafkaProperties.getBootstrapAddress());
props.put(
                    ConsumerConfig.GROUP_ID_CONFIG,
                    MyKafkaProperties.GROUP_ID);
props.put(
                    ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                    StringDeserializer.class);
props.put(
                    ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                    StringDeserializer.class);
</pre>

### ConcurrentKafkaListenerContainerFactory
<pre>
factory.setConsumerFactory(consumerFactory());
</pre>

## Create listener
@KafkaListener(topics="blabla", groupId="myconsumerGroup")# springboot-kafka-consumer
