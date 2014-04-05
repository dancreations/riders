package com.riders.vos;

import java.io.Serializable;

public class UsuarioVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer idUsuario;

	private String email;

	private String password;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setId(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

}
