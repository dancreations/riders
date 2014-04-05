package com.riders.model.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.riders.model.Cliente;

@Repository(value = "clienteDao")
@Transactional
public class ClienteDAO extends GenericBaseDao<Cliente, Integer> {

	public ClienteDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public ClienteDAO() {
		super();
	}

	@Transactional(readOnly = true)
	public Cliente findByEmail(String email) {

		Query q = getSessionFactory().getCurrentSession().createQuery(
				"select c from Cliente c WHERE email=:email ");

		q.setParameter("email", email);

		Object uniqueResult = q.uniqueResult();

		return (Cliente) uniqueResult;
	}

}
