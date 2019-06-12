package com.project.product.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
@Slf4j
public class MessageReceiver {
    // 项目启动后自动创建队列，并和交换机进行绑定，绑定规则为key
    @RabbitListener(
            bindings = @QueueBinding(
                    exchange = @Exchange("shop-exchange"),
                    key = "shop-key",
                    value = @Queue("shop-queue")
            )
    )
    public void process(Message message) {
        String str = new String(message.getBody(), StandardCharsets.UTF_8);
        log.info("MessageReceiver:{}", str);
    }
}
