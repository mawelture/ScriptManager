package com.mx.dao;

import java.util.List;

public interface IDao<T> {

    public void insert(T entry);

    public void delete(T entry);

    public void update(T entry);

    public List<T> getAllEntries();

    public T getById(String id);
}
