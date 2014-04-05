package com.riders.spring.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riders.adapter.ClienteAdapter;
import com.riders.constantes.EstadosUsuario;
import com.riders.model.Cliente;
import com.riders.model.dao.ClienteDAO;
import com.riders.vos.ClienteVO;

@Service("clienteService")
public class ClienteService {

	@Autowired
	private ClienteDAO clienteDao;

	public ClienteDAO getClienteDao() {
		return clienteDao;
	}

	public void setClienteDao(ClienteDAO clienteDao) {
		this.clienteDao = clienteDao;
	}

	
	public void guardar(ClienteVO clienteVo) {

		Cliente cliente = ClienteAdapter.convert(clienteVo);

		cliente.setEstado(EstadosUsuario.NUEVO);
		clienteDao.create(cliente);

	}
	
	
	public ClienteVO login(String email, String password) {

		if ((email != null) && (password != null)) {
			Cliente cliente = clienteDao.findByEmail(email);

			if ((cliente != null) && (cliente.getPassword().trim().equals(password.trim()))) {
				return ClienteAdapter.convert(cliente);
			}

		}

		return null;

	}
}
