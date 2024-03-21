package com.princeKumar.kafkaconsumerexample.consumer;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaMessageListner {

    @KafkaListener(topics = "JavaTechie-demo3" ,groupId = "pr-group-1")
    public void consumer1(String message)
    {
        log.info("Consumer1 consume the message ==================================={}",message);
    }
    @KafkaListener(topics = "JavaTechie-demo3" ,groupId = "pr-group-1")
    public void consumer2(String message)
    {
        log.info("Consumer2 consume the message+++++++++++++++++++++++++++++++++++++++++++++++++ {}",message);
    }
    @KafkaListener(topics = "JavaTechie-demo3" ,groupId = "pr-group-1")
    public void consumer3(String message)
    {
        log.info("Consumer3 consume the message $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$${}",message);
    }
    @KafkaListener(topics = "JavaTechie-demo3" ,groupId = "pr-group-1")
    public void consumer4(String message)
    {
        log.info("Consumer4 consume the message *********************************************************{}",message);
    }

}
