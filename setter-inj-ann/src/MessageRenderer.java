package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Required;
public class MessageRenderer{
	
	private MessageProvider provider;
	
	@Required
	public void setMessageProvider(MessageProvider provider){
		this.provider = provider;	
	}
		
	public void render(){
	System.out.println(provider.getMessage());
	}
}