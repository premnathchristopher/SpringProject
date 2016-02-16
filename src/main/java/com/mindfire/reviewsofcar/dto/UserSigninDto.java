package com.mindfire.reviewsofcar.dto;

public class UserSigninDto {

	private String username;
	private String password;

	public UserSigninDto() {

	}

	public UserSigninDto(String username, String password) {
		this.username = username;
		this.password = password;

	}

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
}
