package com.riders.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.riders.spring.servicios.ClienteService;
import com.riders.vos.ClienteVO;
import com.riders.vos.CuentaCorrienteVO;
import com.riders.vos.DomicilioVO;

@Component
@Scope("session")
@Qualifier("altaUsuarioBacking")
public class AltaUsuarioBacking {

	private ClienteVO cliente = new ClienteVO();

	private DomicilioVO domicilio = new DomicilioVO();

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private SessionUser session;

	public ClienteService getClienteService() {
		return clienteService;
	}

	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public SessionUser getSession() {
		return session;
	}

	public void setSession(SessionUser session) {
		this.session = session;
	}

	public String generarAlta() {
		cliente.setDomicilio(domicilio);
		
		CuentaCorrienteVO cuenta = new CuentaCorrienteVO();
		cuenta.setDebe_total(0);
		cliente.setCuenta(cuenta);
		
		getClienteService().guardar(cliente);
		return "success";
	}

	public ClienteVO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteVO cliente) {
		this.cliente = cliente;
	}

	public void setDomicilio(DomicilioVO domicilio) {
		this.domicilio = domicilio;
	}

	public DomicilioVO getDomicilio() {
		return domicilio;
	}

}
