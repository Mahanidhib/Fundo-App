package com.bridgelabz.fundonoteapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class UserDetails {
	@Id
	@GeneratedValue
	private int userId;
	@Column(name = "NAME", unique = true)
	private String userName;
	private String password;
	private String mobileNumber;
	private int activeStatus;
	@Column(name = "EMAILID", unique = true)
	private String emailId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return emailId;
	}

	public void setEmail(String email) {
		this.emailId = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNumber;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNumber = mobileNo;
	}

	public int getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(int activeStatus) {
		this.activeStatus = activeStatus;
	}

}
