package com.riders.model.dao;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.riders.model.Producto;

@Service("productoDao")
public class ProductoDAO extends GenericBaseDao<Producto, Integer> {

	public ProductoDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public ProductoDAO() {
		super();
	}

}
