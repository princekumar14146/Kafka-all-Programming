package com.springboot.kafkaproducerexample.Service;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {
   /*
       here in this programme i have created one topic i.e javatechie-demo1 but if we want ti create another topic we can create
       manually by uisng terminal but we can also create it by uinsg Spring framework i.e programatically i.e in spring framework
       provide one Class i.e NewTopic
    */
    @Autowired
    private KafkaTemplate<String,Object> template;


    public void sendMessageToTopic(String message)
    {
       CompletableFuture<SendResult<String,Object>> future= template.send("JavaTechie-demo3", message);
       future.whenComplete((result,ex)->{
            if(ex==null)
            {
                System.out.println("Sent message=[" + message+ "] with offset=[" +result.getRecordMetadata().offset() +"]");
            }else {
                  System.out.println("Unable to send message=[" +message+ "] due to :"+ex.getMessage());
            }
       });
    }

}
