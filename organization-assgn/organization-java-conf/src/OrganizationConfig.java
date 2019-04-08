package com.capgemini.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.model.*;
import com.capgemini.spring.*;
import com.capgemini.spring.config.*;
import java.util.*; 
import java.io.*;


@Configuration
public class OrganizationConfig {
	
	public List<String> getDirectors(){
		List<String> directors = new ArrayList<>();
		directors.add("Akash");
		directors.add("Mallesh");
		return directors;
	}

	public Set<String> getBranches(){
		Set<String> branches = new HashSet<>();
		branches.add("IT");
		branches.add("Commerce");
		return branches;
	}


	public Map<String,String> getBranchWiseHead(){
		Map<String,String> branchWiseHead = new HashMap<>();
 		branchWiseHead.put("IT","Akash");
		branchWiseHead.put("Commerce","Mallesh");
		return branchWiseHead;
	}

	public Properties getIpAddress(){
		Properties ipAddress = new Properties();
		ipAddress.put("IT","192.168.0.1");
		ipAddress.put("Commerce","192.168.1.1");
		return ipAddress;
	}

	public Properties getDatabase(){
		Properties databaseDetails = new Properties();
		FileReader reader = null;
		try{
			reader = new FileReader("src/dbConfig.properties");
			databaseDetails.load(reader);
		}
		catch(IOException e){
			e.printStackTrace();
		}
	
	return databaseDetails;

	}


	public Address getAddress(){
		Address address = new Address("Mumbai","UP");
		return address;
	}



		@Bean("organization")
		public Organization organization(){
		Organization organization = new Organization();
		organization.setOrgId(101);
		organization.setOrgName("Capgemini");
		organization.setMarketPrice(20000);
		organization.setAddress(getAddress());
		organization.setDirectors(getDirectors());
		organization.setBranches(getBranches());
		organization.setBranchWiseHead(getBranchWiseHead());
		organization.setIpAddresses(getIpAddress());
		organization.setDatabaseDetails(getDatabase());
		return organization;

	}
}