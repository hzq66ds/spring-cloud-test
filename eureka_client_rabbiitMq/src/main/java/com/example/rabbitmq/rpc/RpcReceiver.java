package com.example.rabbitmq.rpc;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RpcReceiver {

    @RabbitListener(queues = "rpca")
    public String rpcreceive1(String in) {
        System.out.printf(" [rpca_A] Received '%s'%n",in);
        return "rpca_A:"+in;
    }

    @RabbitListener(queues = "rpca")
    public String rpcreceive2(String in) {
        System.out.printf(" [rpca_B] Received '%s'%n",in);
        return "rpca_B:"+in;
    }
}