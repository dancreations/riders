package com.riders.model.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.riders.model.Usuario;

@Repository(value = "usuarioDao")
@Transactional
public class UsuarioDAO extends GenericBaseDao<Usuario, Integer> {

	public UsuarioDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public UsuarioDAO() {
		super();
	}

	public void update(Usuario usuario) {
	}

	public boolean remove(Usuario usuario) {
		int count = 0;
		return count == 1;
	}

	public List<Usuario> findAll() {
		return null;
	}

	public List<Usuario> findByName(String name) {
		return null;
	}

	public Usuario findById(int id) {
		return null;
	}

	@Transactional(readOnly = false)
	public Usuario create(Usuario item) {
		getSessionFactory().getCurrentSession().saveOrUpdate(item);
		return item;
	}

}
