package ro.shareyourcar.dao;

import java.util.Collection;

import ro.shareyourcar.domain.AbstractModel;

public interface BaseDAO<T extends AbstractModel> {

	Collection<T> getAll();

	T findById(Long id);

	T findByUserName(String query);

	T update(T model);

	T updateEdit(T model);

	boolean delete(T model);

}
