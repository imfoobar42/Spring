package com.capgemini.spring.renderer;
import org.springframework.beans.factory.annotation.Autowired;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Required;
public class MessageRenderer{
	
	private MessageProvider provider;
	
	@Autowired	
	public MessageRenderer(MessageProvider provider){
		this.provider = provider;
	
	}
//	@Required
//	public void setMessageProvider(MessageProvider provider){
//		this.provider = provider;
//	}
		
	public void render(){
	System.out.println(provider.getMessage());
	}
}