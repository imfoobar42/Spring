package com.capgemini.spring.renderer;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;



@Lazy
@Component
public class MessageRenderer{
	
	private MessageProvider provider;
	
	@Autowired
	@Qualifier("gm")
	public void setMessageProvider(MessageProvider provider){
		this.provider = provider;	
		System.out.println("-------Bean Created-------");

	}
		
	public void render(){
	System.out.println(provider.getMessage());
	}
}