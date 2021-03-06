package com.icefive.config;

import javax.jms.MessageListener;
import javax.jms.QueueConnectionFactory;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import nz.net.ultraq.thymeleaf.LayoutDialect;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.mvc.support.ControllerClassNameHandlerMapping;
import org.thymeleaf.spring4.SpringTemplateEngine;

import com.icefive.mq.MyListener;

@Configuration
public class AppConfig {
	
	public static final String MQ_CONNECTOR_URL = "tcp://localhost:61616";
	public static final String MQ_BROKER_NAME = "ICE_BROKER";
	
	public static final String DB2_CONNECTOR_URL = "jdbc:db2://200.1.4.70:8001/losdev";
	public static final String DB2_USER = "losdev";
	public static final String DB2_PASSWORD = "passw0rd";
	@Autowired
	DataSource dataSource;

	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public MessageListener myListener() {
		return new MyListener();
	}
	
	@Bean QueueConnectionFactory queueConnectionFactory(){
		return new ActiveMQConnectionFactory(MQ_CONNECTOR_URL);
	}
	
	@Bean DataSource dataSource(){
		return new DriverManagerDataSource(DB2_CONNECTOR_URL,DB2_USER,DB2_PASSWORD);
	}
	
	@Bean XADataSource xaDataSource(){
		//return null;new DriverManagerDataSource(DB2_CONNECTOR_URL,DB2_USER,DB2_PASSWORD);
		return null;
	}
	
	@Bean ControllerClassNameHandlerMapping controllerClassNameHandlerMapping (){
		return new ControllerClassNameHandlerMapping ();
	}
	
//	@Bean
//	public ViewResolver tilesViewResolver() {
//	    ThymeleafViewResolver vr = new ThymeleafViewResolver();
//	    vr.setTemplateEngine(templateEngine());
//	    vr.setViewClass(ThymeleafTilesView.class);
//	    vr.setCharacterEncoding("UTF-8");
//	    vr.setOrder(Ordered.LOWEST_PRECEDENCE);
//	    return vr;
//	}
//	
//	@Bean
//	public ViewResolver thymeleafViewResolver() {
//	    ThymeleafViewResolver vr = new ThymeleafViewResolver();
//	    vr.setTemplateEngine(templateEngine());
//	    vr.setCharacterEncoding("UTF-8");
//	    vr.setOrder(Ordered.HIGHEST_PRECEDENCE);
//	    // all message/* views will not be handled by this resolver;
//	    vr.setExcludedViewNames(new String[]{"message/*"});
//	    return vr;
//	}
//	
//	@Bean
//	public SpringTemplateEngine templateEngine() {
//	    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//	    templateEngine.addDialect(new TilesDialect());
//	    return templateEngine;
//	}
//	
//	@Bean
//	public ThymeleafTilesConfigurer tilesConfigurer() {
//	    ThymeleafTilesConfigurer ttc = new ThymeleafTilesConfigurer();
//	    ttc.setDefinitions(new String[]{"/WEB-INF/views/message/tiles-defs.xml"});
//	    return ttc;
//	}
	
	
//	@Bean
//	public SpringTemplateEngine templateEngine() {
//	    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//	    templateEngine.addDialect(new LayoutDialect());
//	    return templateEngine;
//	}
	
}
