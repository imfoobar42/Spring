package com.capgemini.spring.model;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class Address {
	
    @Value("Mumbai")
    private String city;
    
    @Value("Maharashtra")
    private String state;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state +  "]";
	}
	public Address() {
		super();
	}
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
    
	
	
}
