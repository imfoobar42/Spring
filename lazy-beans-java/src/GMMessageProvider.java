package com.capgemini.spring.provider;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;


@Lazy
@Component("gm")
public class GMMessageProvider implements MessageProvider{
	
	@Override
	public String getMessage(){
		return "Good Morning !!!!";
	}
}
