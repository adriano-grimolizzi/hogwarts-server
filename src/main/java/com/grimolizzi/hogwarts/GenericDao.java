package com.grimolizzi.hogwarts;

import java.util.List;

public interface GenericDao<T> {

  List<T> getAll();

  T get(String id);

  void create(T t);
}
