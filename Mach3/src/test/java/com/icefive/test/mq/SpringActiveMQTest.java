package com.icefive.test.mq;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQDestination;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = {"classpath:/activemq-context.xml"})
public class SpringActiveMQTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private JmsTemplate template;

    @Autowired
    private ActiveMQDestination destination;

    @Test
    public void testJMSFactory() {
        /* sending a message */
        template.convertAndSend(destination, "Hi");

        /* receiving a message */
        Object msg = template.receive(destination);
        if (msg instanceof TextMessage) {
            try {
                System.out.println(((TextMessage) msg).getText());
            } catch (JMSException e) {
                System.out.println("Error : " + e.getMessage());
            }
        }
    }
}