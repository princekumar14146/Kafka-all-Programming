package com.springboot.kafkaproducerexample.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

    /*
       here some important points:-

       1) If we are not providing any NewTopic and, through send method only send topic name and message then internally topic is created
          and by default partition is 1 and replication factor is also 0 and if there is only one consumer then
          it gets the data from the partition.

       2) If we are not providing any NewTopic and partition and there are number  of consumer but all the consumer are in single group
          then only one consumer of that group gets assigned with partition and only one consumer received message.

       3) if the partition is only one and there are number of consumer in different consumer group then the partition gets assigned with
          all the consumer group then one consumer from each group receive the message from that partition.

       4) if we provide NewTopic and partition is 3 then in single group if there is 4 consumer then 3 consumer gets assigned with the 3 partition and
          the remaining one is left with no partition and as any consumer gets down then the fourth consumer gets the partition.
     */

    @Bean
    public NewTopic createTopic(){
        return new NewTopic("JavaTechie-demo3", 3, (short)1);
    }


}
