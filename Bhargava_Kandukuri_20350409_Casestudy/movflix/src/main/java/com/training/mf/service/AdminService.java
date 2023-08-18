package com.training.mf.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService {

	private String username = "stella@gmail.com";
	private String password = "stellar";
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean adminCheck(String userName, String passWord) {
		if((getUsername().equals(userName)) && (getPassword().equals(passWord))) {
			System.out.println("Admin check passed....");
			return true;
		}
		System.out.println("Admin check failed....");
		return false;
	}
}
