package com.grimolizzi.hogwarts;

import java.util.List;

public interface GenericService<T> {

	public List<T> getAll();

	public T get(String id);

	public void create(T t);
}
