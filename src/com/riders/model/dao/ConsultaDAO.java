package com.riders.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.riders.model.Consulta;

@Repository(value = "consultaDao")
@Transactional
public class ConsultaDAO extends GenericBaseDao <Consulta, Integer>{
	
	public ConsultaDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public ConsultaDAO() {
		super();
	}

}
