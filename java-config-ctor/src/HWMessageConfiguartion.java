package com.capgemini.spring.annotation;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HWMessageConfiguartion
{
	@Bean
	public MessageProvider provider()
	{
		return new HWMessageProvider();
	}
	

	@Bean        
	public MessageRender renderer()
	{             
   		MessageRender renderer = new MessageRender(provider());        
//       		renderer.MessageRender(provider());           
  
   		return renderer;       
	 } 

}