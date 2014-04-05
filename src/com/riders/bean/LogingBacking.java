package com.riders.bean;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.riders.spring.servicios.ClienteService;
import com.riders.spring.servicios.UsuarioService;
import com.riders.vos.ClienteVO;

@Component
@Scope("session")
@Qualifier("logingBacking")
public class LogingBacking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private ClienteService clienteService;


	@Autowired
	private UsuarioService usuarioService;


	@Autowired
	private SessionUser session;

	private String email;
	private String password;

	public LogingBacking() {
	}

	public LogingBacking(ClienteService clienteService, SessionUser session) {
		super();
		this.clienteService = clienteService;
		this.session = session;
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

	public String login() {

		ClienteVO user = getClienteService().login(email, password);

		if (user != null) {
			session.setUser(user);
			return "success";
		} else {
			FacesContext.getCurrentInstance().addMessage("password",
					new FacesMessage("Datos ingresados invalido"));
			return "error";
		}

	}

	public void olvidePassword() {
		if (email != null && !email.equals("")) {
			getUsuarioService().resetPassword(email);
		} else {
			FacesContext.getCurrentInstance().addMessage("email",
					new FacesMessage("Se debe ingresar el email"));
		}

	}

	public ClienteService getClienteService() {
		return clienteService;
	}

	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public void setSession(SessionUser session) {
		this.session = session;
	}

	public SessionUser getSession() {
		return session;
	}
	
	
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
}
