package com.riders.adapter;

import com.riders.model.Cliente;
import com.riders.vos.ClienteVO;

public class ClienteAdapter {

	public static ClienteVO convert(Cliente cliente) {

		ClienteVO clienteVO = new ClienteVO();

		clienteVO.setEmail(cliente.getEmail());
		clienteVO.setNombre(cliente.getNombre());
		clienteVO.setApellido(cliente.getApellido());
		clienteVO.setRazonSocial(cliente.getRazonSocial());
		clienteVO.setTelefono(cliente.getTelefono());
		clienteVO.setPassword(cliente.getPassword());
		clienteVO.setCuitCuil(cliente.getCuit());
		clienteVO.setEstado(cliente.getEstado());
		clienteVO
				.setDomicilio(DomicilioAdapter.convert(cliente.getDomicilio()));
		clienteVO
				.setCuenta(CuentaAdapter.convert(cliente.getCuentaCorriente()));

		return clienteVO;

	}

	public static Cliente convert(ClienteVO clienteVO) {

		Cliente cliente = new Cliente();

		cliente.setEmail(clienteVO.getEmail());
		cliente.setNombre(clienteVO.getNombre());
		cliente.setApellido(clienteVO.getApellido());
		cliente.setRazonSocial(clienteVO.getRazonSocial());
		cliente.setTelefono(clienteVO.getTelefono());
		cliente.setPassword(clienteVO.getPassword());
		cliente.setCuit(clienteVO.getCuitCuil());
		cliente.setEstado(clienteVO.getEstado());
		cliente.setDomicilio(DomicilioAdapter.convert(clienteVO.getDomicilio()));
		cliente.setCuentaCorriente(CuentaAdapter.convert(clienteVO.getCuenta()));

		return cliente;

	}

}
