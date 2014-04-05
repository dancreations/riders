package com.riders.spring.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riders.mail.SendMail;
import com.riders.model.Usuario;
import com.riders.model.dao.ClienteDAO;
import com.riders.model.dao.UsuarioDAO;
import com.riders.vos.UsuarioVO;

@Service("usuarioService")
public class UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDao;

	@Autowired
	private ClienteDAO clienteDao;

	public UsuarioService(UsuarioDAO usuarioDao) {
		super();
		this.usuarioDao = usuarioDao;
	}

	public UsuarioService() {
		super();
	}

	public String resetPassword(String email) {

		if (email != null) {
			Usuario user = clienteDao.findByEmail(email);

			if (user != null) {
				SendMail sendMail = new SendMail(
						"contacto@bits-consulting.com.ar", user.getEmail(),
						"Cambio de password", "tu contraseña es:"
								+ user.getPassword());

				sendMail.send();

				return user.getEmail();
			}

		}

		return null;

	}

	public void guardarUsuario(UsuarioVO usuarioVo) {

		Usuario usuario = new Usuario();
		usuario.setEmail(usuarioVo.getEmail());
		usuario.setPassword(usuarioVo.getPassword());
		usuarioDao.create(usuario);

	}

	public UsuarioDAO getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDAO usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

}
