package com.taylor.amq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/7/3 14:50
 */
@Component
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(){
        String context="hello"+new Date();
        System.out.println("Sender: "+context);
        this.rabbitTemplate.convertAndSend("hello",context);
    }
}
