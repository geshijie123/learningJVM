package com.rabbitmq;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
public class Send {
  private final static String QUEUE_NAME = "hello";
  public static void main(String[] argv) throws Exception {
      ConnectionFactory factory = new ConnectionFactory();
      factory.setHost("192.168.252.64");
      factory.setPort(5672);
      factory.setUsername("admin");
      factory.setPassword("admin");
      factory.setVirtualHost("my_vhost");
      try (Connection connection = factory.newConnection();
           Channel channel = connection.createChannel()) {

          channel.queueDeclare(QUEUE_NAME, false, false, false, null);
          String message = "2333";
          while (true){
              Thread.sleep(300);
//              message+="2333;";
              channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
              System.out.println(" [x] Sent '" + message + "'");
          }

      }
  }
}  