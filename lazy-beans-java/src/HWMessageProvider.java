package com.capgemini.spring.provider;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Lazy
@Component("hw")
public class HWMessageProvider implements MessageProvider {
	
	@Override
	public String getMessage(){
		return "Hello World";
	}
}
