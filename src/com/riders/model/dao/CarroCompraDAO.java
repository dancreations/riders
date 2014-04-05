package com.riders.model.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.riders.model.CarroCompra;

@Service("CarroCompraDao")
public class CarroCompraDAO extends GenericBaseDao<CarroCompra, Serializable>{

	public CarroCompraDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public CarroCompraDAO() {
		super();
	}
}
