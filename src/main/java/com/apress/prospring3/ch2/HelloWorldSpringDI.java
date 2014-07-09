package com.apress.prospring3.ch2;

import org.apache.log4j.or.jms.MessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		// Initialize Spring Application
		ApplicationContext ctx=new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		MessageRenderer mr=ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}

}
