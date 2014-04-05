package com.riders.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.riders.dao.IGenericDAO;

@Transactional
@Repository
public class GenericBaseDao<T, PK extends Serializable> implements
		IGenericDAO<T> {

	@Resource
	private SessionFactory sessionFactory;

	private Class<T> type;

	public GenericBaseDao() {
		super();
	}

	public GenericBaseDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional(readOnly = false)
	public PK save(final T o) {

		return (PK) getSessionFactory().getCurrentSession().save(o);
	}

	public List<T> findAll() {
		return null;
	}

	public List<T> findByName(String name) {
		return null;
	}

	public T findById(int id) {
		return null;
	}

	@Transactional(readOnly = false)
	public T create(T item) {
		sessionFactory.getCurrentSession().saveOrUpdate(item);
		return item;
	}

	@Transactional(readOnly = false)
	public void update(T item) {
		getSessionFactory().getCurrentSession().update(item);
	}

	public boolean remove(T item) {
		return false;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Class<T> getType() {
		return type;
	}

}
