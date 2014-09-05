package com.apress.prospring3.ch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
	public String getMessage() {
		return "Hello World!";
		}
}
