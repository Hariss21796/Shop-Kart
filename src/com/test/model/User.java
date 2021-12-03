package com.test.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String userNmae;
	private String gmail;
	private String password;
	private String cnfPassword;

	public User(String id, String userNmae, String gmail, String password, String cnfPassword) {
		super();
		this.id = id;
		this.userNmae = userNmae;
		this.gmail = gmail;
		this.password = password;
		this.cnfPassword = cnfPassword;
	}

	public User() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserNmae() {
		return userNmae;
	}

	public void setUserNmae(String userNmae) {
		this.userNmae = userNmae;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnfPassword() {
		return cnfPassword;
	}

	public void setCnfPassword(String cnfPassword) {
		this.cnfPassword = cnfPassword;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userNmae=" + userNmae + ", gmail=" + gmail + ", password=" + password
				+ ", cnfPassword=" + cnfPassword + "]";
	}

}
