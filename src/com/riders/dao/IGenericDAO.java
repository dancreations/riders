package com.riders.dao;

import java.util.List;

/**
 \* @author Daniel Ballerini
 */
public interface IGenericDAO<T> {

    public List<T> findAll();

    public List<T> findByName(String name);

    public T findById(int id);

    public T create(T item);

    public void update(T item);

    public boolean remove(T item);

}