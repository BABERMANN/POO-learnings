package org.example;

public interface Repository<K,T> {
    void save(T entity);
    T findById(K id);


    //TODO findall
}
