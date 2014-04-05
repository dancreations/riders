package com.riders.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.riders.model.CuentaCorriente;

@Repository(value = "cuentaCorrienteDao")
@Transactional
public class CuentaCorrienteDAO extends GenericBaseDao<CuentaCorriente, Integer> {

	public CuentaCorrienteDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public CuentaCorrienteDAO() {
		super();
	}
}
