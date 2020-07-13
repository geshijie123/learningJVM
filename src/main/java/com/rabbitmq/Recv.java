package com.rabbitmq;

import com.rabbitmq.client.*;
import lombok.SneakyThrows;

import java.io.IOException;

public class Recv {

  private final static String QUEUE_NAME = "hello";

  public static void main(String[] argv) throws Exception {
    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("192.168.252.64");
    factory.setPort(5672);
    factory.setUsername("admin");
    factory.setPassword("admin");
    factory.setVirtualHost("my_vhost");
    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();

    channel.queueDeclare(QUEUE_NAME, false, false, false, null);

    // 创建队列消费者
    Consumer consumer = new DefaultConsumer(channel) {
      @SneakyThrows
      @Override
      public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
        String message = new String(body, "UTF-8");
//        Thread.sleep(10);
        System.out.println("receive:" + message);
      }
    };
    // 消息确认机制
    channel.basicConsume(QUEUE_NAME, true, consumer);
    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

  }
}