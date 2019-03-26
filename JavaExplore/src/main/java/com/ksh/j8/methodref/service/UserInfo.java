package com.ksh.j8.methodref.service;

import java.util.Date;

public class UserInfo {
	private final String userId;
	private String userName;
	private String userAddress;
	private Date dateOfBirth;

	private UserInfo(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getDisplayInfo() {
		return "User id : " + getUserId() + "\nname: " + getUserName() + "\naddress: " + getUserAddress()
				+ "\ndate of birth: " + getDateOfBirth();
	}

	public static UserInfo createUserInfo(String userId, String name, String address, Date dateOfBirth) {
		UserInfo userInfo = new UserInfo(userId);
		userInfo.userName = name;
		userInfo.userAddress = address;
		userInfo.dateOfBirth = dateOfBirth;
		return userInfo;
	}

}
