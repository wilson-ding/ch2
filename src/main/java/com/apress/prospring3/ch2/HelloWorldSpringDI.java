package com.apress.prospring3.ch2;

//import org.apache.log4j.or.jms.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		// Initialize Spring Application
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-xml.xml");
		ctx.refresh();
		
		MessageRenderer mr=ctx.getBean("messageRenderer", MessageRenderer.class);
		mr.render();
	}
}
