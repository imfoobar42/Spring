package com.capgemini.spring.test;


import com.capgemini.spring.model.*;
import com.capgemini.spring.*;
import com.capgemini.spring.config.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestOrganization
{
    public static void main(String args[]) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(OrganizationConfig.class);
        // ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Organization organizer=(Organization)context.getBean("organization");
 	
		System.out.println(organizer);
    }

}