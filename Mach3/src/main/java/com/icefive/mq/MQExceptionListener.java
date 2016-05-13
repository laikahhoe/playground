package com.icefive.mq;

import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.MessageListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MQExceptionListener implements ExceptionListener{
	
	private final Logger logger = LoggerFactory.getLogger(MQExceptionListener.class);
	public MQExceptionListener(MessageListener l){
		
	}
	

	@Override
	public void onException(JMSException e) {
		logger.debug("Err" ,e );
		
	}

	
}
