package com.gmarinero.alkemychallenge.security.user;

public class User {

	private String user;
	private String token;
	
	public void setUser(String username) {
		this.user=username;
		
	}
	public void setToken(String token) {
		this.token=token;
	}

	public String getUsername() {
		return user;
	}

	public String getToken() {
		return token;
	}

	public User() {
		
	}
}
