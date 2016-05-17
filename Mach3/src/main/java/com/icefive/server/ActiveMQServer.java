package com.icefive.server;

import org.apache.activemq.broker.BrokerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.icefive.config.AppConfig;

@Component
@Order(1)
public class ActiveMQServer implements SmartLifecycle {

	private final Logger logger = LoggerFactory.getLogger(ActiveMQServer.class);
	private BrokerService server = null;
	private boolean running = false;

	public ActiveMQServer() {

	}

	@Override
	public boolean isRunning() {
		if (server != null) {
			return server.isStarted();
		}
		return running;
	}

	@Override
	public void start() {
		if (server == null) {
			logger.info("Starting MQ server...");
			server = new BrokerService();
			try {
				server.setBrokerName(AppConfig.MQ_BROKER_NAME);
				//server.setUseShutdownHook(false);
				// Add plugin
				//server.setPlugins(new BrokerPlugin[] { new JaasAuthenticationPlugin() });
				// Add a network connection
				//NetworkConnector connector = server
				//		.addNetworkConnector("static://"
				//				+ "tcp://somehost:61616");
				//connector.setDuplex(true);
				server.addConnector(AppConfig.MQ_CONNECTOR_URL);
				server.start();
				running = true;
			} catch (Exception afe) {
				logger.error("Error starting MQ server.", afe);
			} catch (Throwable e) {
				logger.error("Error starting MQ server.", e);
			}
		}
	}

	@Override
	public void stop() {
		logger.info("Stopping MQ server...");
		if (server != null) {
			// server.stopGracefully(arg0, arg1, arg2, arg3);
			try {
				server.stop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("Error stopping MQ server.", e);
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

}
