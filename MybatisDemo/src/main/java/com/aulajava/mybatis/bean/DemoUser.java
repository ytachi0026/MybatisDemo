package com.aulajava.mybatis.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DemoUser implements Serializable{

	private Integer id;
	private String username;
	private String fullname;
	private String email;
	private String password;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return " [DemoUser: "+ "id=" +id + " username="+ username + " fullname=" +fullname
				+ " email=" + email + " password="+password+" ]";
	}
}
