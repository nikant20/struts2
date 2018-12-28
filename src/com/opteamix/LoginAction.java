package com.opteamix;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String uname,password;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() {
		if(uname.equals("Nikant") && password.equals("nikant"))
			return "success";
		else
			return "error";
	}
	
}
