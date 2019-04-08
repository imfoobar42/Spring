package com.capgemini.spring.provider;
import org.springframework.stereotype.*;

@Component("hw")
public class HWMessageProvider implements MessageProvider {
	
	@Override
	public String getMessage(){
		return "Hello World";
	}
}
