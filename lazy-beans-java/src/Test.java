package com.capgemini.spring.test;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	 public static void main(String[] args)  {
			
			  ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

			  System.out.println("-------Bean not created-------");
			MessageRenderer renderer = context.getBean(MessageRenderer.class);
			System.out.println("-------Bean Called-------");
			renderer.render();
			System.out.println("-------Work Done-------");
		}


	}