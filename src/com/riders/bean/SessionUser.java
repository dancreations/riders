package com.riders.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.riders.vos.ClienteVO;

@Component
@Scope("session")
@Qualifier("sessionUser")
public class SessionUser {

	public ClienteVO user;

	public SessionUser() {
		super();
	}

	public ClienteVO getUser() {
		return user;
	}

	public void setUser(ClienteVO user) {
		this.user = user;
	}

	public boolean getLogon() {
		return user != null;
	}

	public void logout() {
		user = null;
	}

	public String checkUser() {
		return this.user == null ? "login" : null;
	}

}
