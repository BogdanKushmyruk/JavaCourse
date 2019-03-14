package com.bkushmyruk.generics;

import java.util.List;

public interface Generic<T> {

    void save(T t);

    List<T> findAll();

    T findById(Long id);

    void delete(Long id);

    <T2> boolean doSmth();

}
