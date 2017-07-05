package com.taylor.amq;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaolu.zhang
 * @desc:
 * @date: 2017/7/3 14:55
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue helloQueue(){
        return new Queue("hello");
    }
}
