package com.capgemini.spring.renderer;



import com.capgemini.spring.provider.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;


@Component
public class MessageRenderer{

	@Autowired
	@Qualifier("hw")
	private MessageProvider provider;
/*	
	public MessageRenderer(MessageProvider provider){
		this.provider = provider;
	
	}
	
	public void setMessageProvider(MessageProvider provider){
		this.provider = provider;
	}
*/		
	public void render(){
	System.out.println(provider.getMessage());
	}


}