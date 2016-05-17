package com.icefive.mq;

import javax.annotation.Priority;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.icefive.server.ActiveMQServer;

@Component
@Order(2)
public class MyListener implements MessageListener, SmartLifecycle{

	private final Logger logger = LoggerFactory.getLogger(MyListener.class);
	@Autowired
	private QueueConnectionFactory queueConnectionFactory;
	
	@Autowired 
	private ActiveMQServer activeMQServer;
	
	private QueueConnection con;
	private boolean running = false;

	public MyListener() {

	}

	@Override
	public boolean isRunning() {
		return running;
	}

	@Override
	public void start() {
		logger.info("Starting MQ Listener...");
		if (con == null) {
			try{
			
				con= queueConnectionFactory.createQueueConnection();
	
				//Note : MQExceptionListener implements javax.jms.ExceptionListener
				con.setExceptionListener(new MQExceptionListener(this));
	
				//Starting connection
				con.start();
	
				QueueSession session = con.createQueueSession(false,Session.CLIENT_ACKNOWLEDGE); // to give flexibility
	
				Queue inQueue = session.createQueue("messageQueue");
	
				QueueReceiver qReceiver = session.createReceiver(inQueue);
	
				//MQPdfMessageListener implements javax.jms.MessageListener
				qReceiver.setMessageListener(new MyListener());
			} catch (Exception afe) {
				logger.error("Error starting MQ Listener.", afe);
			} catch (Throwable e) {
				logger.error("Error starting MQ Listener.", e);
			}
		}
	}

	@Override
	public void stop() {
		logger.info("Stopping MQ Listener...");
		if (con != null) {
			// server.stopGracefully(arg0, arg1, arg2, arg3);
			try {
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("Error stopping MQ Listener.", e);
			}
			running = false;
		}
	}

	@Override
	public int getPhase() {
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		return true;
	}

	@Override
	public void stop(Runnable runnable) {
		stop();
		runnable.run();
	}

    @Override
    public void onMessage(Message message) {

        /* Receive the text message */
        if (message instanceof TextMessage) {

            try {
                String text = ((TextMessage) message).getText();
                logger.info("Message reception from the JMS queue : " + text);

            } catch (JMSException e) {
                logger.error("Error : " + e.getMessage());
            }

        } else {
            /* Handle non text message */
        }
    }
}
