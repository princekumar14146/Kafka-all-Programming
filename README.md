in Producer-Consumer-Communication    

I have done Producer to make one topic i.e javatechie-demo3 and partition 3 and there is a consumer group of 4 consumer so as we run the producer and consumer 3 partion is created and each partition is assigned to each consumer so 3 partition
get assigned to 3 consumer and one gets left for consumer relalancing.    
             But if we make partition as 1 and make one consumer group in which there is 3 consumer then any one of the consumer gets the partition assigned.
             But if we make partition as 1 and make 4 consumer group then each consumer group gets assigned with partition and all fetch the data from the partition.
             
and if the consumer gets stop in the middle then the data not received by the consumer gets shown in offset Explorer in Lag 

             
