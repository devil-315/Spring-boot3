package com.devil.message.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

/**
 * ClassName：MyTopicListener
 *
 * @author: Devil
 * @Date: 2024/12/20
 * @Description:
 * @version: 1.0
 */
@Component
public class MyTopicListener {
    //默认的监听是从消息队列最后一个消息开始拿。新消息才能拿到
    @KafkaListener(topics = "news",groupId = "haha")
    public void haha(ConsumerRecord record){
        //1.获取消息的各种详细信息
        Object key = record.key();
        Object value = record.value();
        System.out.println("收到消息：key[" + key + "] value[" + value +"]");
    }

    //拿到以前的完整消息;
    @KafkaListener(groupId = "hehe",topicPartitions = {
            @TopicPartition(topic = "news",partitionOffsets = {
                    @PartitionOffset(partition = "0",initialOffset = "0")
            })
    })
    public void hehe(ConsumerRecord record){
        //1.获取消息的各种详细信息
        Object key = record.key();
        Object value = record.value();
        System.out.println("======收到消息：key[" + key + "] value[" + value +"]");
    }
}
