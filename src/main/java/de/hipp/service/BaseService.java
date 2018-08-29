package de.hipp.service;

import de.hipp.enity.BaseEntity;
import java.util.List;


public interface BaseService <T extends BaseEntity> {

    public List<T> findAll();

    public T findByID(Integer Id);

    T saveEntity(T race);
}
