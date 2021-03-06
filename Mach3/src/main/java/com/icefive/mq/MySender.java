package com.icefive.mq;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.icefive.config.AppConfig;

public class MySender {
	private static final Logger logger = LoggerFactory.getLogger(MyListener.class);
	
	public static void sendMQ()throws Exception{
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(AppConfig.MQ_CONNECTOR_URL);

		// Create a Connection
		Connection connection = connectionFactory.createConnection();
		connection.start();

		// Create a Session
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

		// Create the destination (Topic or Queue)
		Destination destination = session.createQueue("messageQueue");

		// Create a MessageProducer from the Session to the Topic or Queue
		MessageProducer producer = session.createProducer(destination);
		producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

		// Create a messages
		String text = "Hello world! From: " + Thread.currentThread().getName() + " : " ;
		TextMessage message = session.createTextMessage(text);

		// Tell the producer to send the message
		logger.info("Sent message: "+ message.hashCode() + " : " + Thread.currentThread().getName());
		producer.send(message);

		 // Clean up
		session.close();
		connection.close();
	}

}
